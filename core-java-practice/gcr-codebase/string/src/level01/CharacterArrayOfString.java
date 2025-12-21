package level01;
import java.util.*;
public class CharacterArrayOfString {

	public static char[] convertToArray(String str) {
		char[] array = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			array[i] = str.charAt(i);
		}
		return array;
	}
	
	public static boolean compareArray(char[] charArray1, char[] charArray2) {
		if(charArray1.length != charArray2.length) {
			return false;
		}
		for(int i=0; i<charArray1.length; i++) {
			if(charArray1[i]!=charArray2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charArray1 = str.toCharArray();
		char[] charArray2 = convertToArray(str);
		boolean result = compareArray(charArray1, charArray2);
		
		System.out.println("Are both character array same? "+result);
		sc.close();
	}

}
