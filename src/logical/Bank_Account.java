package logical;

class Bank{
	String bankname = "BOB";
}

class Account extends Bank{
	int accno;
	double balance;
	
	Account(int accNo, double balance){
		this.accno = accNo;
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Bank : " + bankname + " | A/C : " + accno + " | Balance : " + balance);
	}
}

class SavingAccount extends Account{
	double interestRate = 0.04;

	SavingAccount(int accNo, double balance) {
		super(accNo, balance);
	}
	
	void addIntersest() {
		double interest = balance * interestRate;
		balance += interest;
		System.out.println("Interest Added : " + interest + " | New Balance : " + balance);
	}
}

public class Bank_Account {

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount(101, 2000000);
		s.display();
		s.addIntersest();

	}

}
