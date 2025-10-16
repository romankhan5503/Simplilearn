package practice;

class Animals{
	void eat() {
		System.out.println("animal is eating");
	}
}

class Dogs extends Animals {
	void sound() {
		System.out.println("sounding");
	}
}

class Cats extends Animals{
	void walk() {
		System.out.println("barking");
	}
}

public class Heirarchical {

	public static void main(String[] args) {
		Cats c = new Cats();
		c.eat();
		c.walk();
		
		Dogs  d = new Dogs();
		d.eat();
		d.sound();

	}

}
