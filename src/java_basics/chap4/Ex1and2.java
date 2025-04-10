package java_basics.chap4;

import java.util.*;

public class Ex1and2 {
    public int hexValue(Character s) {
        switch (s) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return Character.getNumericValue(s);
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        Ex1and2 h = new Ex1and2();
        int value = 0;
        boolean t = true;
        System.out.println("Enter a hexadecimal number: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (h.hexValue(str.charAt(i)) == -1) {
                System.err.println("Error... the number is not hexadecimal!");
                t = false;
                break;
            }
            value = (value * 16) + h.hexValue(str.charAt(i));
        }
        if (t != false) {
            System.out.println(value);
        }
        s.close();
    }
}