package conditionalstatements;

public class For {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Count is: " + i);
		}

		
		//Enhanced for loop
		int [] num = {1,2,3,4,5};
		
		for(int item : num) {
			System.out.println("Count is: " + item);
		}
		
		
		//Nested for loop
		int arr[][] = {{5,8,6}, {2,5,7}, {8,9,4}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
