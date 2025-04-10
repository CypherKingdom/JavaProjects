package java_basics.chap4;
import java.util.Scanner;

public class Ex5and6 {
    public static String generate(String fname, String lname, int age){
        String pass = "" + fname.charAt(0) + lname.charAt(0) + age;
        //Ex6: String pass1=""+fname.charAt(fname.length()/2)+lname.charAt(lname.length()/2)+age*100;
        return pass;
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname=scan.next();
        System.out.print("Enter your last name: ");
        String lname=scan.next();
        System.out.print("Enter your age: ");
        int age=scan.nextInt();
        String pas= generate(fname, lname, age);
        System.out.println("Your password is: "+pas);
        scan.close();
    }
}