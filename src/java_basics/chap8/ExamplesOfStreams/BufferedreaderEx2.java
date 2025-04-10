package java_basics.chap8.ExamplesOfStreams;
import java.io.*;
import java.util.*;

public class BufferedreaderEx2 {
    public static void main (String args[]){
        File myfile = new File("Crazy.txt");
        String string;
        StringTokenizer t;
        try {
            FileReader i = new FileReader(myfile);
            BufferedReader stream = new BufferedReader(i);
            while((string = stream.readLine()) != null){ // Check for null here
                t = new StringTokenizer(string ," \n,");
                while(t.hasMoreTokens()) {
                    System.out.println(t.nextToken());
                }
            }
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

