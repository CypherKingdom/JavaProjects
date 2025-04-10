package java_basics.chap8.ExamplesOfStreams;
import java.io.*;
public class RandomAccessFileEx {
    public static void  main(String[] a) {
        File myfile = new File("Output.txt");
        try {
            RandomAccessFile stream = new RandomAccessFile(myfile, "rw");
            stream.setLength(0);//makes the file empty destroys old content
            for(int i = 0; i<200; i++){
                stream.writeInt(i);
            }
            System.out.println("after inputting integers fo=rom the for loop we get a length of" + stream.length());
            stream.seek(0);//the pointer is set at the beginning
            stream.seek(1*4);//badel kel integer is 4 bytes addamna one integer wsolna al second number
            System.out.println("the second number is"+stream.readInt());
            stream.seek(9*4);//we moved to the 10 th integer
            System.out.println("the 10 th integer would be"+stream.readInt());
            //our pointer sar 3al 11th integer because we read from the file
            stream.writeInt(555);
            stream.seek(stream.length());
            stream.writeInt(999);
            //menkoun zedna a number at the end of file
            System.out.println("the new length is"+ stream.length());
            stream.seek(10*4);
            System.out.println("the eleventh number is " + stream.readInt());
            stream.close();

        } catch (IOException e) {
            System.err.println("error has occurred");
        }
    }
}
