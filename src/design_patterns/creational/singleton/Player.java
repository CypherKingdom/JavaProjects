package design_patterns.creational.singleton;

public class Player {
    public static void main(String[] args) {
        Dice dice = Dice.getInstance();
        System.out.println(dice.toss());
    }
}
