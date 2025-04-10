package design_patterns.creational.exercise1;

public class CheckingAccount extends Account {
    public CheckingAccount(String fullName, double balance){
        super(fullName, balance, 0, "checking");
    }
}
