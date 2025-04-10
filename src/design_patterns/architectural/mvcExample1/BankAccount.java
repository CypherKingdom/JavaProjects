package design_patterns.architectural.mvcExample1;

public class BankAccount {
    private String accountHandler;
    private double balance;

    public BankAccount(String accountHandler, double balance) {
        this.accountHandler = accountHandler;
        this.balance = balance;
    }

    public String getAccountHandler() {
        return accountHandler;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws Exception {
        if (this.balance > amount) {
            this.balance -= amount;
        } else {
            throw new Exception("Insufficient money");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
