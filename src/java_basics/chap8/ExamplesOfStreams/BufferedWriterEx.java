package java_basics.chap8.ExamplesOfStreams;

import java.io.*;

public class BufferedWriterEx {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Output.txt");
            BufferedWriter stream = new BufferedWriter(fw);
            String s = "im ina payphone trying to call home";
            stream.write(s,0,s.length());
            //off indicates from which point we want to output the string(included)
            //s.length + off excluded
            //i=off;i<length()+off;i++
            stream.newLine();
            stream.write(s,2,s.length()-4);
            //stream.write("\n similar way of doing what's above");
            stream.flush();
            stream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
