package conditionalstatements;

public class DoWhile {

	public static void main(String[] args) {
		//do while loop runs at least once, even if the condition is false
		int count = 1;
		
		do {
			System.out.println("Count is: " + count);
			count ++;
		} while (count < 10);

	}

}
