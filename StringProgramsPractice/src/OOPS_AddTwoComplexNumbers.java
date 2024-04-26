
public class OOPS_AddTwoComplexNumbers {
	
	private double real;
	private double imag;
	
	public OOPS_AddTwoComplexNumbers(double real, double imag) {
		this.real = real;
		this.imag = imag;	
	}
	
	OOPS_AddTwoComplexNumbers add(OOPS_AddTwoComplexNumbers n2) {
		OOPS_AddTwoComplexNumbers temp = new OOPS_AddTwoComplexNumbers(0.0, 0.0);
		
		temp.real = this.real + n2.real;
		temp.imag = this.imag + n2.imag;
		return temp;
 	}

	public static void main(String[] args) {
		
		OOPS_AddTwoComplexNumbers n1, n2, result;
		
		n1 = new OOPS_AddTwoComplexNumbers(2.9, 4.5);
		n2 = new OOPS_AddTwoComplexNumbers(3.1, 5.0);
		
		result = n1.add(n2);
		
		System.out.println("Sum = " + result.real + " + " + result.imag + "i");
	}

}
