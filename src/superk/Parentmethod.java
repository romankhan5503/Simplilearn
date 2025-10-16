package superk;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	void sound() {
		super.sound();  // call parent method
		System.out.println("Dog Barks");
	}
}

public class Parentmethod {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
//		d.bark();

	}

}
