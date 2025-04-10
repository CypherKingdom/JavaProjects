package design_patterns.behavioral.strategy;

public class ByBike implements Strategy {

    @Override
    public void execute(String destination) {
        System.out.println("Going by bike to " + destination);
    }

}
