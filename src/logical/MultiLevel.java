package logical;

class Vehicle{
	void show() {
		System.out.println("vehiicle starts");
	}
} 

class Car extends Vehicle{
	void fuel() {
		System.out.println("Car use Petrol/CNG");
	}
}

class ElectricCar extends Car{
	void battery() {
		System.out.println("Electric car uses Battery");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		ElectricCar e = new ElectricCar();
		e.show();
		e.fuel();
		e.battery();

	}

}
