package level01;
import java.util.*;
public class SubstringFromString {
	
	public static String substring(String str, int start, int end) {
		String subStr = "";
		if(str.length()<end+1) {
			return subStr;
		}
		for(int i=start; i<=end; i++) {
			subStr += str.charAt(i);
		}
		return subStr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		System.out.print("Enter starting index: ");
		int startIndex = sc.nextInt();
		System.out.print("Enter ending index: ");
		int endIndex = sc.nextInt();
		
		String subStr1 = substring(str, startIndex, endIndex);
		String subStr2 = str.substring(startIndex, endIndex+1);
		
		boolean result = CompareTwoStrings.compare(subStr1, subStr2);
		System.out.println(subStr1+" "+subStr2);
		System.out.println("Is both substring same?"+result);
		sc.close();
	}

}
