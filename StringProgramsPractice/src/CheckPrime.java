
public class CheckPrime {

	public static void main(String[] args) {
		int n = 23;
		int i = 2;
		boolean flag = false;
		while(i < n) {
			if(n % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		if(!flag)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is not prime");

	}

}
