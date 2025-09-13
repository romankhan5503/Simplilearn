package oops;

class Bicycle2{
	protected int gear;
	protected int speed;
	
	Bicycle2(int startSpeed, int startGear){
		gear = startGear;
		speed = startSpeed;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	void speedUp(int increment) {
		speed += increment;
	}
	
}

class MountainBike3 extends Bicycle2{

	int seatHeight;
	
	MountainBike3(int startHeight, int startSpeed, int startGear){
		super(startSpeed, startGear);
		seatHeight = startHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue + 2;
	}
	
	public void applyBrake(int decrement) {
		speed = speed - decrement - 10;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment + 10;
	}
	
}

public class MORDemo {

	public static void main(String[] args) {
		Bicycle2 bicycle = new Bicycle2(10, 1);
		System.out.println("Bicycle gear is : " + bicycle.gear);
		System.out.println("Bicycle speed is : " + bicycle.speed);
		
		bicycle.applyBrake(1);
		System.out.println("Bicycle speed after applying breaks is: "+ bicycle.speed);
		
		Bicycle2 mountainbike = new MountainBike3(50, 50, 3);
		System.out.println("MountainBike Gear is : " + mountainbike.gear);
		System.out.println("MountainBike Speed is : " + mountainbike.speed);
		
		mountainbike.applyBrake(1);
		System.out.println("MountainBike speed after applying break is : " + mountainbike.speed);

		mountainbike.speedUp(10);
		System.out.println("Bike speed after speeding is : " + mountainbike.speed);
	}

}
