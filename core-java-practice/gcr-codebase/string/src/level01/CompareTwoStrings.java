package level01;
import java.util.*;
public class CompareTwoStrings {

	public static boolean compare(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println("Is both string same(using loop)? "+compare(str1, str2));
		System.out.println("Is both string same(using built-in)? "+str1.equals(str2));
		sc.close();
	}

}
