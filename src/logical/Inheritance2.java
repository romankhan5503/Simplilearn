package logical;

class Employee{
	String name;
	double salary;
	
	void setData(String n, double s) {
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println(name + " salary is " + salary);
	}
}

class Manager extends Employee{
	double bonus = 10000;
	
	void totalSalary() {
		System.out.println("Total Salary :" + (salary + bonus));
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.setData("Roman", 50000);
		m.display();
		m.totalSalary();
	}

}
