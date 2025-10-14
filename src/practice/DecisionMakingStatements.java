package practice;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		int age = 20;
		
		//if / if-else 
		if(age >= 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}

		//if-else-if
		int marks = 75;
		if(marks >= 90) {
			System.out.println("Grade A");
		} else if(marks >= 75) {
			System.out.println("Grade B");
		} else if(marks >= 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
		
		//nested if
		int agee = 25, weight = 70;
		
		if(agee >= 18) {
			if(weight > 50) {
				System.out.println("u r eligible to donate blood");
			}
		}
		
		//switch 
		int day = 1;
		
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
			
		case 2: 
			System.out.println("Tuesday");
			break;
			
		case 3: 
			System.out.println("Wednesday");
			break;
			
		case 4: 
			System.out.println("Thursday");
			break;
			
		case 5: 
			System.out.println("Friday");
			break;
			
		case 6: 
			System.out.println("Saturday");
			break;
			
		case 7: 
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("invalid day");
		}
		
		
	}

}
