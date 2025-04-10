package java_basics.chap6.ex5;

public abstract class Contact { 
    private String fname , lname;

    public Contact(String fname ,String lname){
        this.fname =fname;
        this.lname =lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Contact [fname=" + fname + ", lname=" + lname + "]";
    }
    
    public abstract void communicate();
}