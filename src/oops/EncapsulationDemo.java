package oops;

class Student{
	private String name;
	private int age;
	private String address;
	
	Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getAddress() {
		return address;
	}
	
	public String toString() {
		return ("Student name is : " + this.getName() + 
				", Age is : " + this.getAge() + 
				" and address is : "+ this.getAddress());
	}
}

public class EncapsulationDemo extends Student{

	EncapsulationDemo(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student s = new Student("John", 25, "23 East, California");
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());

	}

}
