package design_patterns.behavioral.strategy;

public class ByBus implements Strategy{

    @Override
    public void execute(String destination) {
        System.out.println("Going by bus to " + destination);
    }

}
