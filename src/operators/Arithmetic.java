package operators;

public class Arithmetic {

	public static void main(String[] args) {
		
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int Original_result = result;
		
		result = result - 1;
		System.out.println(Original_result + " - 1 = " + result);
		Original_result = result;
		
		result = result * 2;
		System.out.println(Original_result + " * 2 = " + result);
		Original_result = result;
		
		result = result / 2;
		System.out.println(Original_result + " / 2 = " + result);
		Original_result = result;
		
		result = result + 8;
		System.out.println(Original_result + " + 8 = " + result);
		Original_result = result;
		
		result = result % 7;
		System.out.println(Original_result + " % 7 = " + result);
		Original_result = result;
	}

}
