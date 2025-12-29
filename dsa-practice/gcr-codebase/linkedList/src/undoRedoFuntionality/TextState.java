package undoRedoFuntionality;

class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}