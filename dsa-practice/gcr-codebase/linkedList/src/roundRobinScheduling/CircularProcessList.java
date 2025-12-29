package roundRobinScheduling;
import java.util.List;
import java.util.ArrayList;

class CircularProcessList {
    private Node last;

    public CircularProcessList() {
        last = null;
    }

    // Add process at the end
    public void addProcess(Process p) {
        Node newNode = new Node(p);
        if (last == null) {
            last = newNode;
            last.next = newNode; // Circular link
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode; // Update last to new node
        }
    }

    // Remove process by Process ID
    public boolean removeProcess(int processID) {
        if (last == null) return false;

        Node current = last.next;
        Node prev = last;

        do {
            if (current.process.processID == processID) {
                if (current == last && current.next == last) {
                    // Only one node
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
        return false; // Not found
    }

    // Check if list is empty
    public boolean isEmpty() {
        return last == null;
    }

    // Display current processes
    public void displayProcesses() {
        if (last == null) {
            System.out.println("Process list is empty.");
            return;
        }
        Node ptr = last.next;
        System.out.println("Current Processes:");
        do {
            System.out.printf("PID: %d, Burst Time: %d, Priority: %d%n",
                    ptr.process.processID, ptr.process.burstTime, ptr.process.priority);
            ptr = ptr.next;
        } while (ptr != last.next);
    }

    // Get the process list as a List (for convenience)
    public List<Node> getNodes() {
        List<Node> nodes = new ArrayList<>();
        if (last == null) return nodes;
        Node ptr = last.next;
        do {
            nodes.add(ptr);
            ptr = ptr.next;
        } while (ptr != last.next);
        return nodes;
    }
}
