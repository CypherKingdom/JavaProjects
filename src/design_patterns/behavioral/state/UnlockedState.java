package design_patterns.behavioral.state;

public class UnlockedState implements PhoneState {
    private PhoneContext context;

    public void setContext(PhoneContext context){
        this.context = context;
    }

    @Override
    public void pressButton(String button) {
        if (button.equals("lock")){
            PhoneState state = new LockedState();
            state.setContext(context);
            this.context.changeState(state); 
            System.out.print("Locking Phone");
        }
       else
            System.out.println("Phone is unlocked. Executing functionality...");
    }    

}
