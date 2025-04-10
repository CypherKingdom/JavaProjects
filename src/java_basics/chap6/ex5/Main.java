package java_basics.chap6.ex5;
import java.util.*;

public class Main {
    public static void main(String[] args){ 
        Directory d = new Directory();
        d.addContact("Sandy", "khoury", "email", "sandy@name", null);
        d.addContact("Jad", "khoury", "phone", null, "70789654");
        d.addContact("Maria", "Sleiman", "mixed", "maria@name", "123456");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name of the contact you wish to communicate with: ");
        String fname = scan.next();
        System.out.println("Enter the last name of the contact you wish to communicate with: ");
        String lname =scan.next();
        d.communicateWithContact(fname, lname);
        scan.close();
    }
}
