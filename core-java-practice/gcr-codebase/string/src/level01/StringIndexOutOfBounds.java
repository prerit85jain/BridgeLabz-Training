package level01;

import java.util.Scanner;

public class StringIndexOutOfBounds {

	public static void getArray(String text) {
		System.out.println("Character at index "+text.length()+"is "+text.charAt(text.length()));
	}
	
	public static void indexOutOfBoundsException(String text) {
		try {
			System.out.println("Character at index "+text.length()+"is "+text.charAt(text.length()));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Caught error: "+e);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		indexOutOfBoundsException(text);
		getArray(text);
		sc.close();
	}

}
