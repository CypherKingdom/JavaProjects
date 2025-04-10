package design_patterns.creational.prototype;

import java.util.Date;

public class BirthCertificate extends Certificate{
    public Date birthDate;

    public BirthCertificate(String fullName, Date issueDate, Date expiryDate, String officer) {
        super(fullName, issueDate, expiryDate, officer, "");
        this.setType("Birth");
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}