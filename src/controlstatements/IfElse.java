package controlstatements;

public class IfElse {

	public static void main(String[] args) {
		
		int testscore = 76;
		char grade;
		
		if(testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80){
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if(testscore >= 60) {
			grade = 'D';
		} else if(testscore >= 50) {
			grade = 'E';
		}
		else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);

		//if else statement
				int marks = 70;
				
				if (marks >= 70) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
				
				//if, else if, else statement
				int number = 90;
				
				if (number <= 70) {
					System.out.println(true);
				} else if (number >= 80) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
				
				//real life example of door lock
				int door_lock = 4362;
				
				if (door_lock == 4362) {
					System.out.println("Door is Open");
				} else {
					System.out.println("Wrong Password");
				}
				
				//real life example to find even or odd
				int num = 7;
				
				if (num % 2 == 0) {
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
	}

}
