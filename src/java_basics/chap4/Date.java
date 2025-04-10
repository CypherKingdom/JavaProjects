package java_basics.chap4;
import java.util.*;
public class Date {
    public static void main(String [] args){
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());

        Calendar c2 = Calendar.getInstance();
        c2.set(2004,2,4);
        System.out.println(c2.getTime());
    }
}