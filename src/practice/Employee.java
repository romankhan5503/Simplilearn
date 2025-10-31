package practice;

public class Employee {

	int empid;
	String name;
	static String Company = "Smart Programming";
	
	Employee(int empid, String name){
		this.empid = empid;
		this.name = name;
	}
	
	void display() {
		System.out.println(empid + " " + name + " " + Company);
	}
	
	public static void main(String_Demo1[] args) {
		Employee e = new Employee(101, "roman");
		e.display();
		
		Employee e1 = new Employee(102, "Arkem");
		e1.display();

	}

}
