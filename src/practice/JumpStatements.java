package practice;

public class JumpStatements {

	static int square(int x) {
		return x * x;
	}
	
	public static void main(String[] args) {

		// break
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}

		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}

		//return
		int result = square(5);
		System.out.println(result);
	}
}
