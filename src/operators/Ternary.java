package operators;

public class Ternary {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
		
//		if(a < b) {
//			result = a;
//		} else {
//			result = b;
//		}
		//instead of this we write this
		result = a < b ? a : b;
		
		System.out.println(result);

	}

}
