public class Palindrome{
    // Main function
    public static void main(String[] args) {
        String str = "Prerit";
        if(isPalindrome(str)){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    // Function to check string is palindrome or not and return boolean value
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        str = str.toLowerCase();

        while(left < right){
            if(str == null || str.isEmpty()){
                return false;
            }
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}