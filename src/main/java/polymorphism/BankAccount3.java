package polymorphism;

public class BankAccount3 {
    private double balance;

    public BankAccount3(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New balance: $"+ balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount3 {
    private double withdrawalLimit = 1000;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Cannot withdraw more than $" + withdrawalLimit );
            System.out.println("From savings account");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("SavingsAccount Withdrawn: $" + amount);
            System.out.println("New balance: $"+ getBalance());
        }
    }
}

class CheckingAccount extends BankAccount3 {
    private double fee = 2.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount + fee > getBalance()) {
            System.out.println("Insufficient balance including fee.");
        } else {
            setBalance(getBalance() - (amount + fee));
            System.out.println("CheckingAccount Withdrawn: $" + amount);
            System.out.println("New balance: $" + getBalance());
            System.out.println("With $" + fee + " fee");

        }
    }
}
