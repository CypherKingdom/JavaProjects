package design_patterns.behavioral.strategy;

public class ByCar implements Strategy {

    @Override
    public void execute(String destination) {
        System.out.println("Going by car to " + destination);
    }

}
