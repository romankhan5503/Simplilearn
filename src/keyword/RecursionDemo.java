package keyword;

class ComplexFunction{
	int calculatorFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * calculatorFactorial(n - 1));
		}
	}
}

public class RecursionDemo {

	public static void main(String[] args) {
		ComplexFunction complexFunction = new ComplexFunction();
		
		int result = complexFunction.calculatorFactorial(5);
		
		System.out.println("Factorial of 5 is: " + result);

		
		
	}

}
