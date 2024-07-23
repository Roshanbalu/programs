class BankAccount2 {
    protected int accountNumber;
    protected double balance;
    protected double interestRate;

     BankAccount2(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

 class SavingsAccount extends BankAccount2 {
    protected  double minimumBalance;

    public SavingsAccount(int accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        BankAccount2 bankAccount = new BankAccount2(1234, 1000, 0.05);
        bankAccount.deposit(500);
        System.out.println("Bank Account Balance: " + bankAccount.balance);

        SavingsAccount savingsAccount = new SavingsAccount(5678, 2000, 0.05, 1000);
        savingsAccount.deposit(300);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: " + savingsAccount.balance);
    }
}
