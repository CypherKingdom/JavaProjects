package java_basics.chap8;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File f1 = new File("MyFile.txt");
        File f = new File("YourFile.txt");
        try{
            FileWriter w = new FileWriter("MyFile.txt", true);
            w.write("how are you today\n");
            w.write("Hello World");
            w.flush();
            w.close();           
            FileReader r = new FileReader(f1);
            char[] buffer = new char[(int)f.length()];
            r.read(buffer);
            System.out.println(buffer);
            r.close();
            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            String line;
            while((line = r1.readLine()) != null){
            System.out.println(line);
            }
            r1.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
