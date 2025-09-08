package controlstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number (1 to 7): ");
		int week = sc.nextInt();
		String days;
		
		switch (week) {
		case 1:
			days = "Monday";
			break;
			
		case 2:
			days = "Tuesday";
			break;
			
		case 3:
			days = "Wednesday";
			break;
			
		case 4:
			days = "Thusday";
			break;
			
		case 5:
			days = "Friday";
			break;
			
		case 6:
			days = "Saturday";
			break;
			
		case 7:
			days = "Sunday";
			break;
			
		default:
			days = "Invalid days";
			break;
		}
		System.out.println(days);
		
		System.out.print("Enter a number (1 to 12): ");
		int year = sc.nextInt();
		String month ;
		
		switch (year) {
		case 1:
			month = "January";
			break;
			
		case 2:
			month = "February";
			break;
			
		case 3:
			month = "March";
			break;
			
		case 4:
			month = "April";
			break;
			
		case 5:
			month = "May";
			break;
			
		case 6:
			month = "June";
			break;
			
		case 7:
			month = "July";
			break;
			
		case 8:
			month = "August";
			break;
			
		case 9:
			month = "September";
			break;
			
		case 10:
			month = "October";
			break;
			
		case 11:
			month = "Novemeber";
			break;
			
		case 12:
			month = "December";
			break;
			
		default:
			month = "Invalid month";
			break;
		}

		System.out.println(month);
	}

}
