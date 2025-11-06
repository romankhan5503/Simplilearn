package java8;

interface Animal{
	void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog is barking");
		
	}
	
}

public class AbstractMethod {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

	}

}
