package java_basics.chap8.ExamplesOfStreams;
import java.io.*;
public class FileWriterEx {
    public static void main(String[] args) {
        File myfile = new File("Output.txt");
        try {//try catch kel marra
            Boolean b = true;
            FileWriter stream = new FileWriter(myfile, b);//eza ma men7ott b bta3mol overwrite
            //we can also do it like that
            //FileWriter stream = new FileWriter("Output.txt");
            stream.write("as long as im slim shady you gon have to live in my shadow");
            stream.write(" what happens if we write?");
            stream.write(" \n I sit back with this bag of zigzags");
            stream.append(" and this bag of this weed it give me the shit needed");
            stream.close();//we don't use flush() because there is no buffer

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
