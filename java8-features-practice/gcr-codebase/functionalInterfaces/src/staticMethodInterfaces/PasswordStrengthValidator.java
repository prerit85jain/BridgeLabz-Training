package staticMethodInterfaces;

interface SecurityUtils{
	static boolean isStrongPassword(String password) {
		
		if (password.length() < 8) {
			return false;
		}
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSpeacial = false;
		
		for(char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch))	hasUpper = true;
			else if (Character.isLowerCase(ch))	hasLower = true;
			else if (Character.isDigit(ch))	hasDigit = true;
			else hasSpeacial = true;
		}
		return hasUpper && hasLower && hasDigit && hasSpeacial;
	}
}

public class PasswordStrengthValidator {
	public static void main(String[] args) {
		String password1 = new String("Prem@012");
		String password2 = new String("Prerit05");
		
		System.out.println("Password1 strong? "+ SecurityUtils.isStrongPassword(password1));
		System.out.println("Password2 strong? "+ SecurityUtils.isStrongPassword(password2));
	}
}
