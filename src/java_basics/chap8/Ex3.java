package java_basics.chap8;

import java.io.*;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        String line;
        try {
            System.out.println("Enter the name of the file: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("Enter a string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter another string: ");
            String s2 = sc.nextLine();
            BufferedReader in = new BufferedReader(new FileReader(str));
            BufferedWriter out = new BufferedWriter(new FileWriter("newfile.txt"));
            while ((line = in.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ,.?!:;");
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    if (word.equals(s1)) {
                        out.write(s2);
                        out.write(" ");
                        continue;
                    }
                    out.write(word);
                    out.write(" ");
                }
                line = line.trim();
                out.write('\n');
            }
            sc.close();
            in.close();
            out.close();
            File f1 = new File(str);
            File f2 = new File("newfile.txt");
            f1.delete();
            f2.renameTo(f1);
        } catch (IOException ex) {
            System.err.println("Error opening the file...");
        }
    }
}
