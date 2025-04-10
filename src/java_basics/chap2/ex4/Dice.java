package java_basics.chap2.ex4;

public class Dice {
    public int d1;
    public int d2;
    public int nbOfRolls = 0;

    public Dice() {
        roll();
    }

    public void roll() {
        int n1 = (int) (Math.random() * 7);
        int n2 = (int) (Math.random() * 7);
        this.d1 = n1;
        this.d2 = n2;
    }

    public int rollFor(int x) {
        while (this.d1 + this.d2 != x) {
            // System.out.println(this.d1+this.d2);
            roll();
            nbOfRolls++;
        }
        // System.out.println(this.d1+this.d2);
        nbOfRolls++;
        return nbOfRolls;
    }
}