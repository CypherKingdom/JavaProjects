package java_basics.chap7;

import java.util.*;

public class Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, den;
        boolean found = false;
        while (!found) {
            try {
                System.out.println("Enter the numerator:");
                num = scan.nextInt();
                System.out.println("Enter the denominator:");
                den = scan.nextInt();
                System.out.println("Result of the division is: " + num / den);
                found = true;
            } catch (InputMismatchException e) {
                System.out.println("Bad Input! Try Again");
            } catch (ArithmeticException e) {
                System.out.println("Bad Input! Cannot Devide by Zero! Try Again");
            } finally {
                System.out.println("If something went wrong, you entered bad data.");
            }
        }
        scan.close();
    }
}