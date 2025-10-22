package packages;

class Animal{
	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("barking....");
	}
}


//Employee salary
class Employee{
	String name;
	long salary;
	
	Employee(String n, long s){
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println(name + " " + salary);
	}
}

class Manager extends Employee{
	
	long bonus = 10000;
	
	Manager(String n, long s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
 
	void totalSalary() {
		System.out.println("Total Salary: ₹" + (salary + bonus));
	}
	
}


//heirarichal 

class Shape{
	void area() {
		System.out.println("Calculating Area....");
	}
}

class Circle extends Shape{
	void area(double r) {
		System.out.println("Circle Area : " + (3.14*r*r));
	}
}

class Rectangle extends Shape{
	void area(double l, double b) {
		System.out.println("Rectabgle area : " + (l*b));
	}
}

public class Practice {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		//d.eat(10);
		
		Manager m = new Manager("Roman", 50000);
		m.display();
		m.totalSalary();
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		
		c.area(5);
		r.area(4, 6);
	}
}