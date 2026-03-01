package encapsulation;

public class Account2 {
    private String accountNumber;
    private String accountHolder;
    private  double balance;

    public Account2(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public String getAccountNumber() {
        return accountNumber;

    }
    public String getAccountHolder() {
        return accountHolder;

    }
    public double getBalance() {
        return balance;

    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;

    }
    public void setBalance(double balance) {
        this.balance = balance;

    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
    public void info(){
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("AccountHolder: " + accountHolder);
        System.out.println("Balance: " + balance);

    }
}
