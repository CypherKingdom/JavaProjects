package java_basics.chap6.ex5;

import java.util.*;

public class Directory {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String fname, String lname, String type, String Email, String phone){
        Contact c;
        switch (type.toLowerCase()){ 
            case "phone" :
                c = new PhoneContact(fname, lname, phone);
                break;
            case "email": 
                c = new EmailContact(fname, lname, Email);
                break;
            case "mixed":
                c = new MixedContact(fname, lname, phone, Email);
                break;
            default: 
            System.out.println("Contact type does not exist.");
            return;
        }
        this.contacts.add(c);
    }

    public Contact returnContact(String fname, String lname){
        for (Contact c : this.contacts) 
            if (c.getFname().equals(fname) && c.getLname().equals(lname))
                return c;
        System.out.println("Contact not found in directory");
        return null;
    }

    public void communicateWithContact(String fname, String lname){ 
        Contact c = this.returnContact(fname,lname);
        if (c!= null)
            c.communicate();
        else
            System.out.println("Cannot communicate with inexistant contact");
    }
}
