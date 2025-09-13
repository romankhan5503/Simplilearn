package deepakOOPS;


public class Employee{
	String name;
	int age;
	Address adr; //Aggregation
	
	Employee(String name, int age, Address adr) {
		this.name=name;
		this.age=age;
		this.adr=adr;
	}
	
	void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adr.city);
		System.out.println(adr.state);
		System.out.println(adr.country);
	}
	
	public static void main (String args[]) {
		//Address adr = new address(); //Association
		//new Address("mumbai","Maharshtra","india")  //Composition
		Employee e = new Employee("mrk",22,new Address("mumbai","Maharshtra","india"));
		e.show();
	}
	
}

class Address{
	String city,state,country;
	
	Address(String string1,String string2,String string3){
		city = string1;
		state = string2;
		country = string3;
	}
}