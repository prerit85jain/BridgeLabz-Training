package lexicalTwist;

import java.util.*;

public class LeoPuzzle {
	
	public static boolean isInputValid(String input) {
		String[] inputArray = input.trim().split(" ");
		if(inputArray.length == 1)	return false;
		return true;
	}
	
	public static String reversed(String word) {
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IllegalArgumentException {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter first word: ");
			String firstWord = scanner.nextLine();
			if(isInputValid(firstWord)) {
				throw new IllegalArgumentException(firstWord + " in an invalid word");
			}
			System.out.print("Enter second word: ");
			String secondWord = scanner.nextLine();
			if(isInputValid(secondWord)) {
				throw new IllegalArgumentException(secondWord + " in an invalid word");
			}
			
			if(reversed(secondWord).equalsIgnoreCase(firstWord)) {
				String revFirstWord = reversed(firstWord).toLowerCase();
				revFirstWord = revFirstWord.replace('a', '@');
				revFirstWord = revFirstWord.replace('e', '@');
				revFirstWord = revFirstWord.replace('i', '@');
				revFirstWord = revFirstWord.replace('o', '@');
				revFirstWord = revFirstWord.replace('u', '@');
				System.out.println(revFirstWord);
			}else {
				String newWord = firstWord.concat(secondWord).toUpperCase();
				int vowels = 0;
				int consonants = 0;
				for(char ch : newWord.toCharArray()) {
					if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')	vowels++;
					else	consonants++;
				}
				if(vowels > consonants) {
					Set<Character> set = new HashSet<>();
					for(char ch : newWord.toCharArray()) {
						if(set.size() >=2) {
							break;
						}
						else if(!set.contains(ch) && (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
							set.add(ch);
							System.out.print(ch);
						}
					}
				}else if (consonants > vowels){
					Set<Character> set = new HashSet<>();
					for(char ch : newWord.toCharArray()) {
						if(set.size() >=2) {
							break;
						}
						else if(!set.contains(ch) && !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
							set.add(ch);
							System.out.print(ch);
						}
					}
				}else {
					System.out.println("Vowels and consonants are equal");
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
