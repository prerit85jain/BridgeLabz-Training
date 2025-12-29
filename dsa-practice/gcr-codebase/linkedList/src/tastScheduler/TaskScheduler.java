package tastScheduler;

public class TaskScheduler {
    private Node head = null;
    private Node tail = null;

    // Add at the beginning
    public void addAtBeginning(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Add at the end
    public void addAtEnd(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circular link
        }
    }

    // Add at a specific position (0-based index)
    public void addAtPosition(Task task, int position) {
        if (position == 0 || head == null) {
            addAtBeginning(task);
            return;
        }
        Node newNode = new Node(task);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
            if (temp == head) { // Cycled all around
                System.out.println("Position out of bounds");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == tail) {
            tail = newNode; // Update tail if adding at end
        }
    }

    // Remove task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node previous = tail;
        do {
            if (current.task.taskId == taskId) {
                if (current == head) {
                    if (head == tail) { // Only one node
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (current == tail) {
                    previous.next = head;
                    tail = previous;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View current task and move to next
    private Node currentTaskNode = null;

    public void viewCurrentAndNext() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        if (currentTaskNode == null) {
            currentTaskNode = head;
        } else {
            currentTaskNode = currentTaskNode.next;
        }
        displayTask(currentTaskNode.task);
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Node temp = head;
        do {
            displayTask(temp.task);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }
        boolean found = false;
        Node temp = head;
        do {
            if (temp.task.priority == priority) {
                displayTask(temp.task);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

    // Utility to display task details
    private void displayTask(Task task) {
        System.out.println("Task ID: " + task.taskId + ", Name: " + task.taskName +
                ", Priority: " + task.priority + ", Due Date: " + task.dueDate);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks
        scheduler.addAtEnd(new Task(1, "Pay bills", 2, "2025-07-15"));
        scheduler.addAtBeginning(new Task(2, "Buy groceries", 1, "2025-07-10"));
        scheduler.addAtEnd(new Task(3, "Doctor appointment", 3, "2025-07-20"));
        scheduler.addAtPosition(new Task(4, "Call mom", 2, "2025-07-11"), 2);

        // Display all tasks
        System.out.println("\nAll Tasks:");
        scheduler.displayAll();

        // View current task and move to next
        System.out.println("\nCycling through current tasks:");
        scheduler.viewCurrentAndNext(); // First task
        scheduler.viewCurrentAndNext(); // Second task
        scheduler.viewCurrentAndNext(); // Third task

        // Remove a task
        scheduler.removeByTaskId(2);

        // Display all tasks after removal
        System.out.println("\nTasks after removal:");
        scheduler.displayAll();

        // Search by priority
        System.out.println("\nSearching for tasks with priority 2:");
        scheduler.searchByPriority(2);

        // Continue cycling through tasks
        System.out.println("\nCycling through tasks:");
        scheduler.viewCurrentAndNext();
        scheduler.viewCurrentAndNext();
    }
}