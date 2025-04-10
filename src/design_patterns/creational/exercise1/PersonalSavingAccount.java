package design_patterns.creational.exercise1;

public class PersonalSavingAccount extends SavingAccount {
    private String ssn;
    private int age;
    private String job;
    
    public PersonalSavingAccount(String fullName, double balance, double interest){
        super(fullName, balance, interest);
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
