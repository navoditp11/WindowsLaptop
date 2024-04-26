
public class countNumberOfVowelsInString {

	public static void main(String[] args) {
		String s1 = "Java Is Fun";
		boolean isLowerVowel, isUpperVowel;
		
		int vowelCount = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			
			isLowerVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
			isUpperVowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
			
			if(isLowerVowel || isUpperVowel) {
				++vowelCount;
			}
		}
		System.out.println("Vowel Count: " +vowelCount);
	}

}
