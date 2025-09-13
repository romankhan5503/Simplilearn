package deepakOOPS;

abstract class Vehicle{
	int no_of_tyres;

	void displayTyres() {
		System.out.println("No. of Tyres is: " + no_of_tyres);
	}
	
	abstract void start();
}

class Car extends Vehicle{

	@Override
	void start() {
		no_of_tyres = 4;
		System.out.println("Car start with key");
	}
}

class Scooter extends Vehicle{

	@Override
	void start() {
		no_of_tyres = 2;
		System.out.println("Scooter start with kick and self");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.displayTyres();
		
		
		Vehicle scooter = new Scooter();
		scooter.start();
		scooter.displayTyres();
		

	}

}
