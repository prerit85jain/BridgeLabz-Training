package roundRobinScheduling;

class Process {
    int processID;
    int burstTime;
    int priority;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}