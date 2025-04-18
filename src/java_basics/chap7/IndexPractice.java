package java_basics.chap7;

import java.util.*;

public class IndexPractice {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int data = 0, slot = 0;
        int[] value = new int[10];
        try {
            System.out.print("Enter the data: ");
            data = scan.nextInt();
            System.out.print("Enter the array index: ");
            slot = scan.nextInt();
            value[slot] = data;
        } catch (InputMismatchException ex) {
            System.out.println("This is your problem: " + ex.getMessage() + "\n Here is where it happened:\n");
            ex.printStackTrace();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("This is your problem: " + ex.getMessage() + "\n Here is where it happened:\n");
            ex.printStackTrace();
        }
        System.out.println("Goodbye");
        scan.close();
    }
}