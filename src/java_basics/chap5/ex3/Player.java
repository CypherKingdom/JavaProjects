package java_basics.chap5.ex3;

public class Player {
    private int pid;
    private int cid;
    private String name;
    public static int counter=0; 

    public Player(String name, int cid) {
        this.name = name;
        this.pid = counter++;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "This Player is: " + this.name + " of id: " + this.pid + " in the club of id: " + this.cid;
    }

    public int getCid() {
        return this.cid;
    }
 }