package practice;

class Animal{
	void eat() {
		System.out.println("eating......");
	}
	
}

class Dog extends Animal{
	void walk() {
		System.out.println("dog is walking");
	}
}

class Cat extends Dog{
	void sound() {
		System.out.println("cat is meowing");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		

	}

}
