package design_patterns.creational.exercise1;

public abstract class Bank { //public interface Bank{}
    public abstract CheckingAccount createCheckingAccount(String fullName, double balance);
    public abstract SavingAccount createSavingAccount(String fullName, double balance, double interest);
}
