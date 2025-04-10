package design_patterns.behavioral.state;

public class LowChargeState implements PhoneState {
    @SuppressWarnings("unused")
    private PhoneContext context;

    public void setContext(PhoneContext context){
        this.context = context;
    }

    @Override
    public void pressButton(String button) {
        System.out.println("Displaying charging screen...");
    }

}
