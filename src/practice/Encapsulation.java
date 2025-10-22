package practice;

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name; // assign parameter to instance variable
		this.age = age;
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
}

public class Encapsulation {

	public static void main(String[] args) {
		Person p = new Person("Roman", 21);
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
