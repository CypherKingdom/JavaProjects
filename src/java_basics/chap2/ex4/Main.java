package java_basics.chap2.ex4;

public class Main {
    public static void main(String[] args) {
        Dice die = new Dice();
        int nbOfRolls = die.rollFor(2);
        System.out.println(nbOfRolls);
    }
}