package deepakOOPS;

class Account{
	private String accountHolder;
	private double balance;
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("you have deposited "+ amount + " and now balance is " + balance);
	}
	
	public void withdrawl(double amount) {
		balance = balance - amount;
		System.out.println("you have withdraw "+ amount + " and now balance is " + balance);
	}
	
}

public class BankApp {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setAccountHolder("Roman");
		acc.deposit(10000);
		
		acc.setBalance(50000);
		acc.withdrawl(5000);

	}

}
