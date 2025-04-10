package java_basics.chap9.set;

import java.io.*;
import java.util.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("MyFile.txt"));
        String line;
        TreeSet<String> set = new TreeSet<String>();
        while ((line = f.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " .,?!:;\n");
            while (st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase();
                System.out.println(word);
                set.add(word);
            } // end of while
        } // end of outer while
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        f.close();
    }
}
