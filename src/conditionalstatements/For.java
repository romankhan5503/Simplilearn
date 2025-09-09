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
		
		/*
		for (int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		//for even number
		for (int i = 2; i<=50; i=i+2) {
			System.out.println(i);
	    }
	
		//for sum of numbers
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("Sum = " +sum);
		
		
		//real life example
		for (int i = 3; i <= 30; i+=3) {
			System.out.println(i);
		}

		When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
		 
		for(int i =2; i<=50; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i<=50; i+=2) {
			System.out.println(i);
		}
		
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		for (int i = 1; i<=10; i++) {
			System.out.println(5*i);
		}
		*/
	}

}
