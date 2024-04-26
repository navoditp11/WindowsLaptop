
public class checkSubStringPresent {

	public static void main(String[] args) {
		String s1 = "Navodit likes music";
		String s2 = "Navodit";
		
		boolean result = s1.contains(s2);
		
		if(result)
			System.out.println("Substring is present");
		else
			System.out.println("Substring is not present");

	}

}
