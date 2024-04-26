
public class CountNumberOfWordsInSentence {

	public static void main(String[] args) {
		String str = "Java is fun af";
		int wordCount = str.split("\\s+").length;
		System.out.println("No. of words: "+wordCount);

	}

}
