package design_patterns.creational.exercise1;

public class PersonalService extends Bank{

    @Override
    public CheckingAccount createCheckingAccount(String fullName, double balance) {
        return new CheckingAccount(fullName, balance);
    }
    
    @Override
    public SavingAccount createSavingAccount(String fullName, double balance, double interest) {
        return new PersonalSavingAccount(fullName, balance, interest);
    }
}
