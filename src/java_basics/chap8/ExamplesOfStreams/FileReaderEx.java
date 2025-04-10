package java_basics.chap8.ExamplesOfStreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        File myfile = new File("Crazy.txt");//to use file.length()
        char buffer[];
        try{
            FileReader stream = new FileReader(myfile);
            buffer = new char[(int)myfile.length()];
            stream.skip(5);
            //honeh 3a b7added men wen baddeh 2o2ra;
            stream.read(buffer,0,(int)myfile.length());//dont be fooled dumbass
            //honeh 0 w myfile.length-5 do not correspond to reading from the file
            //0 means enno the data will be copied in the beginning of the array
            //length hiyeh addeh 3a bo2ra bel file ta keb jouet el buffer
            //kel el file n7at bel buffer
            //and now we are manipulating the buffer yalli ma32oul ykoun fi special characters at the beginning and in other weird spaces
            //so eza baddeh affeh number of characters deghreh from the file use skip method
            System.out.println(buffer);
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
