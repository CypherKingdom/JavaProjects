package java_basics.chap8.ExamplesOfStreams;

import java.io.IOException;
import java.io.*;
//we dont have to convert data into bytes it is done automatically;
//no buffer here
//haydeh aham chi bayneton
public class DataOutputStreamEx {
    public static void main(String[] chocolat){
        File myfile = new File("Output.txt");
        try{
            DataOutputStream stream = new DataOutputStream(new FileOutputStream(myfile));
            stream.writeUTF("bonjour kifkon \n");
            stream.writeUTF("whatever");
            stream.writeInt(1234);
            stream.writeByte((byte) 'a');
            stream.writeUTF("\n");
            stream.writeBoolean(true);
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
