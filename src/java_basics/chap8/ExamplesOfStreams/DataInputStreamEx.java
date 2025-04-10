package java_basics.chap8.ExamplesOfStreams;
import java.io.*;
public class DataInputStreamEx {
    public static void main(String [] khara){
        File myfile = new File("Output.txt");
        try{
            DataInputStream stream = new DataInputStream(new FileInputStream(myfile));
            System.out.println(stream.readUTF());
            System.out.println(stream.readUTF());
            System.out.println(stream.readInt());
            System.out.println((char)stream.readByte());
            System.out.println(stream.readUTF());
            System.out.println(stream.readBoolean());
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();

        }
    }
}
