 class BankAccount {
    protected int accountNumber;
    protected double balance;
    protected double interestRate;

    public BankAccount(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }
 class SavingsAccount extends BankAccount {
    private double minimumBalance;

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

public class Main6
 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1234, 1000, 0.05);
        bankAccount.deposit(500);
        System.out.println("Bank Account Balance: " + bankAccount.balance);

        SavingsAccount savingsAccount = new SavingsAccount(5678, 2000, 0.05, 1000);
        savingsAccount.deposit(300);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: " + savingsAccount.balance);
    }
}
