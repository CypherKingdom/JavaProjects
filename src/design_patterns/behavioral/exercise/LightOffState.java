package design_patterns.behavioral.exercise;

public class LightOffState implements LightState{
    private Light context;

    public LightOffState(Light context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("turning on the light");
        this.context.setState(new LightOnState(context));
    }

    @Override
    public void turnOff() {
        System.out.println("light is already off");
    }
}
