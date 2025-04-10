package java_basics.chap5.ex3;

public class Main {
    public static void main (String args[]){
        Team t = new Team(23);
        Player p1 = new Player("Jihad Nemer", 23);
        International p2 = new International("Jana Chalhoun", 23, "Lebanon");
        t.addPlayer(p1);
        t.addPlayer(p2);
        System.out.println(t);
    }
}
