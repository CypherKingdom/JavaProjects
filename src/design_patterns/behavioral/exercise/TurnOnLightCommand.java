package design_patterns.behavioral.exercise;

public class TurnOnLightCommand implements Command{
    private Light light; // receiver
    private LightState prevState;

    public TurnOnLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.prevState = light.getState();
        light.turnOn();
    }

    @Override
    public void undo() {
        if(prevState != null){
            System.out.println("Undo light action");
            light.setState(prevState);
        }   
    }
}
