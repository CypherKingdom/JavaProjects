package java_basics.chap8.ExamplesOfStreams;
import java.io.*;

public class BufferedReaderEx {
    public static void main (String args[]){
        String line;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            while ((line = in.readLine()) != null)
                System.out.println(line);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
