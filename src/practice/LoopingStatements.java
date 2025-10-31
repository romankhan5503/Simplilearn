package practice;

public class LoopingStatements {

	public static void main(String_Demo1[] args) {
		
		//for
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//while
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		//do-while
		int r = 1;
		do {
			System.out.println(r);
			r++;
		} while (r >= 10);
		
		//for-each
		int numbers[] = {10, 20, 30, 40, 50};
		for(int n : numbers) {
			System.out.println(n);
		}

	}

}
