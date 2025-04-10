package java_basics.chap4;

import java.lang.Integer;

public class Ex8 {
    public static int findmin(String[] set) {
        int min = 0, y;
        boolean b = false;
        for (int i = 0; i < set.length; i++) {
            y = Integer.parseInt(set[i]);
            if (y > 0 && b == false) {
                min = y;
                b = true;
            }

            if (y > 0 && y < min) {
                min = y;
            }
        }
        return min;
    }

    public static void main(String[] arg) {
        String[] t = { "1", "2", "-36", "-64", "-12" };
        System.out.println("The minimum is: " + findmin(t));
    }
}
// another method
// int min = 0, counter = 0;
//         for (int i = 0; i < s.length; i++) {
//             if (Integer.parseInt(s[i]) >= 0 && counter < 1) {
//                 min = Integer.parseInt(s[i]);
//                 counter++;
//             }
//             if (min > Integer.parseInt(s[i]) && Integer.parseInt(s[i]) >= 0) {
//                 min = Integer.parseInt(s[i]);
//             }
//         }
//         return min;