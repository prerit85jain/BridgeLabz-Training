package undoRedoFuntionality;

public class UndoRedoFunction {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Universe");
        editor.displayCurrentState();

        // Undo again
        editor.undo();
        editor.displayCurrentState();

        for (int i = 1; i <= 10; i++) {
            editor.addState("Line " + i);
        }
        editor.displayCurrentState();

        for (int i = 0; i < 11; i++) {
            editor.undo();
            editor.displayCurrentState();
        }
    }
}