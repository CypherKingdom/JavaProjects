package design_patterns.creational.exercise1;

public class CorporateCheckingAccount extends CheckingAccount {
    private String company;

    public CorporateCheckingAccount(String fullName, double balance){
        super(fullName, balance);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
