package design_patterns.behavioral.state;

public class Client {

    public static void main(String[] args) {
        PhoneState initialState = new LockedState();
        PhoneContext context = new PhoneContext(initialState);
        initialState.setContext(context);

        context.pressPhoneButton("T");
        context.pressPhoneButton("unlock");
    }

}
