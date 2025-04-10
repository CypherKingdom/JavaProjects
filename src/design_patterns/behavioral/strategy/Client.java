package design_patterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        AirportContext context = new AirportContext();
        Strategy strategy = new ByBike();
        context.setStrategy(strategy);
        context.goToAirport();
    }

}
