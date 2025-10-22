package practice;

//🟩 1️⃣ To refer to current class variables
class Student {
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;  // refers to instance variable
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

//🟩 2️⃣ To call current class method
class Example{
	void show() {
		System.out.println("Show method Called");
	}
	
	void display() {
		this.show();  // calling current class method
	}
}

//🟩 3️⃣⃣ To call another constructor in the same class
class Book{
	String title;
	int price;
	
	Book(){
		this("Unknown", 0);
		System.out.println("Default constructor");
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void show() {
		System.out.println(title + " " + price);
	}
}

//🟩 4️⃣ To pass current object as an argument
class Test{
	void show(Test t) {
		System.out.println("Method called using object reference");
	}
	
	void display() {
		show(this);
	}
}

public class This {

	public static void main(String[] args) {
		Student s = new Student("Roman", 21);
		s.display();
		
		Example e = new Example();
		e.display();
		
		Book b = new Book();
		b.show();

		Test obj = new Test();
        obj.display();
	}

}
