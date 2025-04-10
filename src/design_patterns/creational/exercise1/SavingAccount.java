package design_patterns.creational.exercise1;

public class SavingAccount extends Account {
    public SavingAccount(String fullName, double balance, double interest){
        super(fullName, balance, interest, "saving");
    }
}
