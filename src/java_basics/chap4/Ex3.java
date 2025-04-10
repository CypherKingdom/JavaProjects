package java_basics.chap4;
public class Ex3 {
    public static void main(String[] args) {
        String s = "I'm a JaVa PrOgRaMmEr";
        String ss = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm' || s.charAt(i) == 'M') {
                counter++;
            }
        }
        if (counter < 3) {
            System.out.println("The string contains less than 3 m");
            System.exit(-1);// stop the program here
        }
        counter = 0;// reset the counter
        for (int i = 0; i < s.length(); i++) {
            if ((counter < 3) && (s.charAt(i) == 'm' || s.charAt(i) == 'M')) {
                counter++;
                continue; // skip the letter m
            }
            ss += s.charAt(i);
        }
        System.out.println(ss);
    }
}