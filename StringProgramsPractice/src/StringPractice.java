
public class StringPractice {

	public static void main(String[] args) {
		String s = "Rahul Shetty Academy";
		
		String[] splittedString = s.split("Shetty");
		
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		

	}

}
