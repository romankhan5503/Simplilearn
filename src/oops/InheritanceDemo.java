package oops;

class Bike{
	protected int gear;
	protected int speed;
	
	public Bike(int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment; 
	}
}

class MountainBike extends Bike{
	int seatHeight;
	
	MountainBike(int startHeight, int startSpeed, int startGear){
		super(startSpeed, startGear);
		seatHeight = startHeight;
	}
	
	void setHeight(int newValue) {
		
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		MountainBike mb = new MountainBike(20,10,1);
		System.out.println("Gear is : " + mb.gear);
		System.out.println("Seat height is : " + mb.seatHeight);
		System.out.println("Bike speed is : " + mb.speed);
		mb.applyBrake(1);
		System.out.println("Bike speed after applying break is : " + mb.speed);

	}

}
