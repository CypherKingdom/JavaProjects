package java_basics.chap6.ex5;

public class EmailContact extends Contact{
    private String Email;

    public EmailContact(String fname, String lname, String Email){
        super(fname, lname);
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void communicate(){ 
        System.out.println("Communicating via email with "+ this.getFname()+ " "+this.getLname());
    }
}
