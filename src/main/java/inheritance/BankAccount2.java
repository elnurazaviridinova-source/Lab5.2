package inheritance;

public class BankAccount2 {
    protected double balance;

    public BankAccount2(double balance) {
        this.balance = balance;

    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);

    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: " + amount);

    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount2 {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw: minimum balance of 100 required");
        } else {
            super.withdraw(amount);
        }
    }
}