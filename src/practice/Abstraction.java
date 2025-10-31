package practice;

abstract class Animalalia{
	
	abstract void sound();
	
	void eat() {
		System.out.println("Eating....");
	}
}

class Dogarea extends Animalalia{
	
	void sound() {
		System.out.println("Barking...");
	}
}

public class Abstraction {

	public static void main(String_Demo1[] args) {
		Animalalia a = new Dogarea();
		a.eat();
		a.sound();
	}

}
