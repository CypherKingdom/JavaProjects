package java_basics.chap5.sportsplayer;
public class TestPlayer {

    public static void playMatch(SportPlayer p){
        p.play();
        p.addInjury();
    }

    public static void main(String[] args) {
        SportPlayer p1 = new BasketballPlayer("Jawad" , "Fahd" , 0 , 0);
        FootballPlayer p2 = new FootballPlayer("Rana", "Sakr", 5, 2);

        boolean b = p1.equals(p2);
        System.out.println(b);
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());

        //p1.play();
        // playMatch(p1); // Test.playMatch(p1); if the main is not in the class Test
        // playMatch(p2);
    }
}