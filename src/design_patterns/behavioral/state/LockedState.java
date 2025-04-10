package design_patterns.behavioral.state;

public class LockedState implements PhoneState {
    private PhoneContext context;

    public void setContext(PhoneContext context){
        this.context = context;
    }

    @Override
    public void pressButton(String button) {
        if (button.equals("unlock")){
            PhoneState state = new UnlockedState();
            state.setContext(context);
            this.context.changeState(state);
            System.out.println("Unlocking Phone");
        }
        else
            System.out.println("Phone is locked. Displaying unlock screen");
    }

}
