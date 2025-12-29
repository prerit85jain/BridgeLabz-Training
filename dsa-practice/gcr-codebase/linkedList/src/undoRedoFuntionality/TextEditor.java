package undoRedoFuntionality;

class TextEditor {
    private TextState head = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void addState(String newText) {
        TextState newState = new TextState(newText);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        if (head == null) {
            head = newState;
            current = head;
            size = 1;
        } else {
            current.next = newState;
            newState.prev = current;
            current = newState;
            size++;

            if (size > MAX_HISTORY) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        System.out.println("Action added: \"" + newText + "\"");
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: \"" + current.content + "\"");
        } else {
            System.out.println("Editor is empty.");
        }
    }
}