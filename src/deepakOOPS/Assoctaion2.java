package deepakOOPS;



class Pata{
	String city;
	String state;
	String country;
	
	Pata(String ci, String s, String c){
		city = ci;
		state = s;
		country = c;
	}
	
	void printAddress() {
		System.out.println("Address: " + city + state + country);
	}
}

class Student{
	String name;
	int rollno;
	
	Student(String n, int rl){
		name = n;
		rollno = rl;
	}
	void printStudent() {
		System.out.println("Name: " + name);
		System.out.println("Roll_No: " + rollno);
	}
}

public class Assoctaion2 {

	public static void main(String[] args) {
		Student s = new Student("Roman", 22); //Association
		s.printStudent();
		
		Pata addr = new Pata(" Mumbai", " Maharshtra", " India"); //Association
		addr.printAddress();
		

	}

}
