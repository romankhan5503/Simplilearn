package multithreading;

class BookTheaterSeats {

	int total_seats = 10;

	void bookseat(int seats) {

		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());

		synchronized (this) {
			if (total_seats >= seats) {
				System.out.println(seats + " seats booked successfully");
				total_seats = total_seats - seats;
				System.out.println("Seats Left : " + total_seats);
			} else {
				System.out.println("Sorry seats cannot be booked");
				System.out.println("Seats Left : " + total_seats);
			}
		}

		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
	}
}

public class SynchronizationBlockDemo extends Thread {

	static BookTheaterSeats b;
	int seats;

	public void run() {
		b.bookseat(seats);
	}

	public static void main(String[] args) {
		b = new BookTheaterSeats();

		SynchronizationBlockDemo Roman = new SynchronizationBlockDemo();
		Roman.seats = 7;
		Roman.start();

		SynchronizationBlockDemo Shabaz = new SynchronizationBlockDemo();
		Shabaz.seats = 6;
		Shabaz.start();
	}

}
