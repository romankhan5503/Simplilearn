package upcasting;

class Animal{
	void sound() {
		System.out.println("Animal is Good");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog is loyal");
	}
	
	void run() {
		System.out.println("Dog Run fast");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		Animal a = new Dog(); // Upcasting (Dog → Animal)
		a.sound();   // Calls Dog's overridden method
        // a.run();  ❌ Not allowed (parent reference can't access child-specific methods)

	}

}
