package deepakOOPS;

import java.util.Scanner;

interface Payment{
	void pay();
}
class UpiPayment  implements Payment{
	public void pay() {
		System.out.println("Pay using UPI");
	}
}

class NetBanking implements Payment{
	public void pay() {
		System.out.println("Pay using NetBanking");
	}
}

class CheckOut{
	void ProcessPayments(Payment payment) {
		payment.pay();
	}
}

public class MainPayment {

	public static void main(String[] args) {
		Payment upi = new UpiPayment();
	    Payment netbanking = new NetBanking();
	    
	    CheckOut checkout = new CheckOut();
	    
	    System.out.println("1.Payed using UPI");
	    System.out.println("2.Payed using NetBanking");
	    
	    try (Scanner sc = new Scanner(System.in)) {
			int user_input = sc.nextInt();
			switch(user_input) {
			case 1:
				checkout.ProcessPayments(upi);
				break;
				
			case 2:
				checkout.ProcessPayments(netbanking);
				break;
				
			default:
				System.out.println("used another payment");
			}
		}

	}

}
