package practice;

class Person {

	private String name;
	private int age;

	public Person(String string, int age) {
		this.name = string; // assign parameter to instance variable
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

	public static void main(String_Demo1[] args) {
		Person p = new Person("Roman", 21);
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
