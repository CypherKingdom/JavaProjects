package java_basics.chap8.ExamplesOfStreams;
import java.io.*;
//Binary classes
//kelmarra fi intermediary step when dealing with binary files
public class FileOutputStreamEx {
    public static void main(String args[]) {
        File myfile = new File("Output.txt");
        byte[] x = "emilio".getBytes();//7awalna el string la byte buffer
        byte y = (byte) 'x';
        try {
            FileOutputStream stream = new FileOutputStream(myfile);
            stream.write(x);//w kabayna el bytes jouet el byte file
            stream.write(y);//honeh kabayna byte wa7ad
            //each character is represented by a byte;
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
