
public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n = 6;
		System.out.println("Fibonacci series upto " + n + " terms");
		for(int i = 1; i <= n; i++) {
			System.out.print(first + ", ");
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
