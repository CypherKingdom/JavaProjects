package design_patterns.behavioral.strategy;

public class AirportContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void goToAirport() {
        this.strategy.execute("Airport");
    }
}
