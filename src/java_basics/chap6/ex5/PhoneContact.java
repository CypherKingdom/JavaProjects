package java_basics.chap6.ex5;

public class PhoneContact extends Contact {
    private String phone;

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public PhoneContact(String fname, String lname, String phone){ 
        super(fname,lname);
        this.phone = phone;
    }
    public void communicate(){ 
        System.out.println("Communicating via phone with "+ this.getFname()+ " "+this.getLname());
    }
}
