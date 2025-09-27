package multithreading;

class BookTheaterSeat2{
	
	static int total_seats = 15;
	static synchronized void bookseat(int seats) {
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

class MyThread1 extends Thread{
	
	BookTheaterSeat2 b;
	int seats;
	
	MyThread1(BookTheaterSeat2 b, int seats){
		this.b = b;
		this.seats = seats;
	}
	
	public void run() {
		BookTheaterSeat2.bookseat(seats);
	}
}

class MyThread2 extends Thread{
	
	BookTheaterSeat2 b;
	int seats;
	
	MyThread2(BookTheaterSeat2 b, int seats){
		this.b = b;
		this.seats = seats;
	}
	
	public void run() {
		BookTheaterSeat2.bookseat(seats);
	}
}

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		
		BookTheaterSeat2 b1 = new BookTheaterSeat2();
		
		MyThread1 t1 = new MyThread1(b1, 7);
		t1.start();
		MyThread2 t2 = new MyThread2(b1, 6);
		t2.start();

		BookTheaterSeat2 b2 = new BookTheaterSeat2();
		MyThread1 t3 = new MyThread1(b2, 8);
		t3.start();
		MyThread2 t4 = new MyThread2(b2, 9);
		t4.start();
	}

}
