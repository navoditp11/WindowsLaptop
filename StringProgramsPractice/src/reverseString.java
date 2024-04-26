
public class reverseString {

	public static void main(String[] args) {
		String s1 = "Java Is Fun";
		
		//s1 = s1.replace(" ", "");
		for(int i = s1.length() - 1; i >= 0; i--) {
			char ch = s1.charAt(i);
			System.out.print(ch);
		}
	}

}
