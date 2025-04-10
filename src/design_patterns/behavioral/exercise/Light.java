package design_patterns.behavioral.exercise;

//receiver // context
public class Light {
    private LightState state;

    public Light() {
        // set initial light state
        this.state = new LightOffState(this);
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void turnOn() {
        this.state.turnOn();
    }

    public void turnOff() {
        this.state.turnOff();
    }

    public LightState getState() {
        return state;
    }
}
