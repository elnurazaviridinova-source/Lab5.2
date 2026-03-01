package encapsulation;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public String getAccountNumber() {
        return accountNumber;

    }
    public double getBalance() {
        return balance;

    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }
    public void setBalance(double balance) {
        this.balance = balance;

    }
    public void info(){
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("Balance: "+ balance);


    }

}
