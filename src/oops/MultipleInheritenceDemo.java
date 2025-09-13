package oops;

class MountainBike2 implements Bicycle, Vehicle{
	private int seatHeight;
	private int gear;
	private int speed;
	
	MountainBike2(int startHeight, int startSpeed, int startGear){
		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}

	@Override
	public void applyBrake(int decrement) {
		speed = speed - decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	@Override
	public void canDrive() {
		System.out.println("Mountain Bike can be driven");
		
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class MultipleInheritenceDemo {

	public static void main(String[] args) {
		MountainBike2 mb1 = new MountainBike2(20, 10, 1);
		
		System.out.println("Gear is : " + mb1.getGear());
		System.out.println("Seat height is : " + mb1.getSeatHeight());
		System.out.println("Bike speed is : " + mb1.getSpeed());
		mb1.applyBrake(1);
		System.out.println("Bike speed after applying break is : " + mb1.getSpeed());

		mb1.speedUp(10);
		System.out.println("Bike speed after increment is : " + mb1.getSpeed());


	}

}
