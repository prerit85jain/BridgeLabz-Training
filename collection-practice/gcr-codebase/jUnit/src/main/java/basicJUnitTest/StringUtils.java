package basicJUnitTest;

public class StringUtils {
	
	public String reverseWord(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	public boolean isPalindrome(String str) {
		if(str.equals(reverseWord(str))) {
			return true;
		}
		return false;
	}
	
	public String convertToUpperCase(String str) {
		return str.toUpperCase();
	}
}
