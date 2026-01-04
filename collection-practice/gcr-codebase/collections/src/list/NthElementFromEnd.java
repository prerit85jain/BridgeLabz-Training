package list;

public class NthElementFromEnd {

	public static void main(String[] args) {
		char[] list = {'A', 'B', 'C', 'D', 'E'};
		int n = 2;
		int iterate = list.length-n;
		System.out.println(list[iterate]);
	}

}
