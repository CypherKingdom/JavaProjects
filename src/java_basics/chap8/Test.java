package java_basics.chap8;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String line;
        try {
            File nig = new File("nig.txt");
            File nig2 = new File("nig2.dat");
            File nig3 = new File("nig3.txt");
            BufferedReader br = new BufferedReader(new FileReader(nig));
            DataOutputStream patrick = new DataOutputStream(new FileOutputStream(nig2));
            while ((line = br.readLine()) != null) {
                patrick.writeUTF(line);
            }
            System.out.println(nig.length());
            System.out.println(nig2.length());
            br.close();
            patrick.close();
            DataInputStream signigger = new DataInputStream(new FileInputStream(nig2));
            BufferedWriter signigger2 = new BufferedWriter(new FileWriter(nig3));
            while (true) {
                try {
                    signigger2.write(signigger.readUTF());
                } catch (EOFException e) {
                    break; // Exit loop when EOF is reached
                }
            }
            signigger2.close();
            signigger.close();
        } catch (EOFException e) {
            System.out.println("EOF Error1....");
        } catch (IOException ex) {
            System.out.println("IO Error....");
        }
    }
}
