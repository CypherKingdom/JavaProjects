package java_basics.chap8.ExamplesOfStreams;
//binary
import java.io.*;

public class BufferedoutputStreamEx {
    public static void main(String[] a){
        File myfile = new File("Output.txt");
        byte [] x = "emilio".getBytes();
        try{
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(myfile));
            stream.write(x,2,3);//teneh parameter hweh addeh 3a men2addem la 2eddem
            stream.flush();
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
