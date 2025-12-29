package roundRobinScheduling;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RoundRobinScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularProcessList processList = new CircularProcessList();

        // Sample data: Add processes
        System.out.println("Enter number of processes to add:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Process ID, Burst Time, Priority for process %d:%n", i + 1);
            int pid = sc.nextInt();
            int burst = sc.nextInt();
            int priority = sc.nextInt();
            processList.addProcess(new Process(pid, burst, priority));
        }

        System.out.println("\nInitial Process List:");
        processList.displayProcesses();

        // Set time quantum
        System.out.println("\nEnter time quantum:");
        int quantum = sc.nextInt();

        // Simulate round-robin scheduling
        simulateRoundRobin(processList, quantum);

        sc.close();
    }

    public static void simulateRoundRobin(CircularProcessList processList, int quantum) {
        if (processList.isEmpty()) {
            System.out.println("No processes to schedule.");
            return;
        }

        // Copy the process nodes into a list to track remaining burst times
        List<Node> nodes = processList.getNodes();

        // Arrays to store total wait and turnaround time
        int totalWaitTime = 0;
        int totalTurnaroundTime = 0;
        int totalProcesses = nodes.size();

        // Initialize remaining burst times array
        int[] remainingBurstTimes = new int[nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            remainingBurstTimes[i] = nodes.get(i).process.burstTime;
        }

        // Track completion times
        int[] completionTimes = new int[nodes.size()];

        // List to keep track of processes' indexes
        List<Integer> processOrder = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            processOrder.add(i);
        }

        int time = 0;
        boolean done;

        while (true) {
            done = true;
            for (int i = 0; i < processOrder.size(); i++) {
                int idx = processOrder.get(i);
                if (remainingBurstTimes[idx] > 0) {
                    done = false;
                    int execTime = Math.min(quantum, remainingBurstTimes[idx]);
                    // Execute process
                    remainingBurstTimes[idx] -= execTime;
                    time += execTime;
                    // Display current round info
                    System.out.printf("Process %d executed for %d units, Remaining Burst Time: %d%n",
                            nodes.get(idx).process.processID, execTime, remainingBurstTimes[idx]);

                    // Display process list after each process execution
                    System.out.println("Processes after execution:");
                    displayRemainingProcesses(nodes, remainingBurstTimes);
                }
                if (remainingBurstTimes[idx] == 0 && completionTimes[idx] == 0) {
                    completionTimes[idx] = time;
                }
            }
            if (done) break;
        }

        // Calculate Waiting Time and Turnaround Time
        int[] waitingTimes = new int[nodes.size()];
        int[] turnaroundTimes = new int[nodes.size()];

        for (int i = 0; i < nodes.size(); i++) {
            turnaroundTimes[i] = completionTimes[i];
            waitingTimes[i] = turnaroundTimes[i] - nodes.get(i).process.burstTime;
            totalWaitTime += waitingTimes[i];
            totalTurnaroundTime += turnaroundTimes[i];
        }

        // Display processes and their times
        System.out.println("\nProcess\tBurst Time\tCompletion Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < nodes.size(); i++) {
            System.out.printf("%d\t%d\t\t%d\t\t\t%d\t\t%d%n",
                    nodes.get(i).process.processID,
                    nodes.get(i).process.burstTime,
                    completionTimes[i],
                    waitingTimes[i],
                    turnaroundTimes[i]);
        }

        System.out.printf("Average Waiting Time: %.2f%n", (double) totalWaitTime / totalProcesses);
        System.out.printf("Average Turnaround Time: %.2f%n", (double) totalTurnaroundTime / totalProcesses);
    }

    private static void displayRemainingProcesses(List<Node> nodes, int[] remainingBurstTimes) {
        System.out.println("Remaining Processes:");
        for (int i = 0; i < nodes.size(); i++) {
            System.out.printf("PID: %d, Remaining Burst: %d%n",
                    nodes.get(i).process.processID, remainingBurstTimes[i]);
        }
        System.out.println();
    }
}