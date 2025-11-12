package keyword;

class Student{
	
	String name;
	int age;
	String address;
	static String college = "AI4FINTECH";
	static int count = 0;
	
	Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		Student.college = college;
	}
		
	public String toString() {
		return("Student name is : " + this.getName() + 
				", age is : " + this.getAge() + 
				", address is : " + this.getAddress() + 
				" and the college is : " + this.getCollege());
	}
	
	static void studentCount() {
		count = count + 1;
	}
	
	static {
		System.out.println("initailizer code");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Student s = new Student("Roman", 21, "23 West, Mumbai");
		
		System.out.println(s.toString());

	}

}
