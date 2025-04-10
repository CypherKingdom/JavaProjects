package java_basics.chap8;

import java.io.*;
public class Ex4 {
    private RandomAccessFile raf;
    public Ex4 (String filename){
        try {
            raf = new RandomAccessFile(filename, "rw");
            raf.setLength(0);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void addEntry(String fname, String lname, String number) throws IOException{
            raf.seek(raf.length());
            raf.writeUTF(fname);
            raf.writeUTF(lname);
            raf.writeUTF(number);
            raf.writeChar('\n');
    }
    public void firstEntry() throws IOException{
        raf.seek(0);
        String fname = raf.readUTF();
        String lname = raf.readUTF();
        String number = raf.readUTF();
        System.out.println(fname+" "+lname+" "+number);
    }
    public void nextEntry() throws IOException{
        if(raf.getFilePointer()==raf.length()){
            System.out.println("no more next entries");
            return;
        }
        else {
            raf.readChar();
            // Or raf.readLine(); to skip the /n w no2ra li ba3da
            String fname = raf.readUTF();
            String lname = raf.readUTF();
            String number = raf.readUTF();
            System.out.println(fname + " " + lname + " " + number);
        }
    }
    public void previousEntry()throws IOException{
        long currentPos = raf.getFilePointer();
        long now = 0, previous = 0;
        raf.seek(now);
        while (raf.getFilePointer() < currentPos ){
            previous = now;
            now = raf.getFilePointer();
            raf.readLine();
        }
        raf.seek(previous);
        String fname = raf.readUTF();
        String lname = raf.readUTF();
        String number = raf.readUTF();
        System.out.println(fname + " " + lname + " " + number);
    }
    public void lastEntry()throws IOException{
        //long currentPos = raf.getFilePointer();
        long now = 0;
        raf.seek(now);
        while (raf.getFilePointer() != raf.length()){
            now = raf.getFilePointer();
            raf.readLine();
        }
        raf.seek(now);
        String fname = raf.readUTF();
        String lname = raf.readUTF();
        String number = raf.readUTF();
        System.out.println(fname + " " + lname + " " + number);
    }
    public static void main(String[] args) {
        try {
            Ex4 p = new Ex4("Directory.bin");
            p.addEntry("emilio","Yared","01234654");
            p.addEntry("emilio","Yo","01234654");
            p.addEntry("emilio","Ya","01234654");
            p.firstEntry();
            p.nextEntry();
            p.nextEntry();
            p.previousEntry();
            p.lastEntry();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
