package design_patterns.behavioral.exercise;

public class LightOnState implements LightState{
    private Light context;

    public LightOnState(Light context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("light is already on");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off the light");
        this.context.setState(new LightOffState(context));
    }
}
