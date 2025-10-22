package practice;

interface AnimalLover{
	void sound();
	void eat();
}

class DogLovers implements AnimalLover{
	
	public void sound() {
		System.out.println("Dog barks");
	}
	
	public void eat() {
		System.out.println("Dog eat bones");
	}
}

public class AbstractionThroughInterface {

	public static void main(String[] args) {
		AnimalLover a = new DogLovers();
		a.sound();
		a.eat();
	}

}
