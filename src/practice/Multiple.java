package practice;

interface Animalss{
	void bark();
}

interface Pet{
	void eat();
}

class Dogss implements Animalss, Pet{

	@Override
	public void eat() {
		System.out.println("Dog eat food");
	}

	@Override
	public void bark() {
		System.out.println("Dog is barking");
		
	}
	
}

public class Multiple {

	public static void main(String[] args) {
		Dogss ds = new Dogss();
		ds.bark();
		ds.eat();

	}

}
