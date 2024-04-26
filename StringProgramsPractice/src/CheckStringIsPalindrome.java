
public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		String str = "abcddcba";
		boolean isPalindome = true;
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindome = false;
				break;
			}
		}
		
		if(isPalindome) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}

	}

}
