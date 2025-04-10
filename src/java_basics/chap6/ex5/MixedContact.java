package java_basics.chap6.ex5;
import java.util.Scanner;

public class MixedContact extends PhoneContact {
    //private String Email;

    public MixedContact(String fname, String lname, String phone, String Email) {
        super(fname, lname, phone);
        //this.Email = Email;
    }
       @Override
    public void communicate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Communicate via email or phone?");
        String x = scan.next();
        if(x.equalsIgnoreCase("email"))
            System.out.println("Communicating via email with "+ this.getFname()+ " "+ this.getLname());
        else if (x.equalsIgnoreCase("phone"))
        super.communicate();
        scan.close();
    }
}
