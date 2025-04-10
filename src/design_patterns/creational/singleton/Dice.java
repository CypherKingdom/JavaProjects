package design_patterns.creational.singleton;

public class Dice {
    private static Dice dice;

    private Dice(){}

    public static Dice getInstance(){
        if(dice==null)
            dice = new Dice();
        return dice;
    }

    public int toss(){
        return (int)(Math.random()*6)+1;
    }
}
