package multithreading;

class BookTheaterSeat{
	
	int total_seats = 10;
	synchronized void bookseat(int seats) {
		if(total_seats >= seats) {
			System.out.println(seats + " seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats Left : " + total_seats);
		}
		else {
			System.out.println("Sorry seats cannot be booked");
			System.out.println("Seats Left : " + total_seats);
		}
	}
}

public class SynchronizationMethodDemo extends Thread{

	static BookTheaterSeat b;
	int seats; 
	public void run() {
		b.bookseat(seats);
	}
	
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		SynchronizationMethodDemo Roman = new SynchronizationMethodDemo();
		Roman.seats = 7;
		Roman.start();

		SynchronizationMethodDemo Shabaz = new SynchronizationMethodDemo();
		Shabaz.seats = 6;
		Shabaz.start();
	}

}
