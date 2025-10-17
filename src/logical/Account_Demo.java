package logical;

class Bank {
    String bankName = "SBI";
}

class Account extends Bank {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Bank: " + bankName + " | A/C: " + accNo + " | Balance: ₹" + balance);
    }
}

class SavingAccount extends Account {
    double interestRate = 0.04;

    SavingAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest Added: ₹" + interest + " | New Balance: ₹" + balance);
    }
}

public class Account_Demo {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 20000);
        s.display();
        s.addInterest();
    }
}
