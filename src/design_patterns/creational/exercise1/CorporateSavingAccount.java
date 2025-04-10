package design_patterns.creational.exercise1;

public class CorporateSavingAccount extends SavingAccount {
    private String company;
    
    public CorporateSavingAccount(String fullName, double balance, double interest){
        super(fullName, balance, interest);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
