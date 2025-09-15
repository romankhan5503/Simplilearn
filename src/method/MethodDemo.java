package method;

class Student1 {
	String name;
	int age;
	String address;

	public Student1(String name, int age, String address) {
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

	public String toString() {
		return ("Student name is : " + this.getName() + ", Age is : " + this.getAge() + " and address is : "
				+ this.getAddress());
	}
}

public class MethodDemo {

	public static void main(String[] args) {
		int i = 1;
		int result = changeValue(i);
		System.out.println("i is : " + result);

		Student1 s = new Student1("John", 25, "23 East, California");
		//changeNameInSameObject(s);
		Student1 reusltObj = changeNameInDiffObject(s);
		
		System.out.println(reusltObj.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}

	private static int changeValue(int i) {
		i = i + 1;
		return i;
	}
	
	static void changeNameInSameObject(Student1 student1) {
		student1.setName("Roman");
	}

	static Student1 changeNameInDiffObject(Student1 student1) {
		Student1 newStudent1 = new Student1("Roman" , student1.getAge(), student1.getAddress());
		return newStudent1;
	}
}
