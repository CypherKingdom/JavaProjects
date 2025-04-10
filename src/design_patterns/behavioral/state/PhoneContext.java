package design_patterns.behavioral.state;

public class PhoneContext {

    private PhoneState currentState;

    public PhoneContext(PhoneState initialState) {
        this.currentState = initialState;
    }

    public void pressPhoneButton(String button) {
        this.currentState.pressButton(button);
    }

    public void changeState(PhoneState state){
        this.currentState = state;
    }
}
