package level01;

public class NullPointer {
	static String text = null;
    public static void generateNullPointerException() {
        System.out.println("Length of text: " + text);
    }

	public static void handleNullPointerException() {
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }
}
