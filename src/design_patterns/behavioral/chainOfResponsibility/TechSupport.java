package design_patterns.behavioral.chainOfResponsibility;

public class TechSupport extends CustomerServiceAgent {

    @Override
    public void handle(Request request) {
        System.out.println("Tech support is handling your problem. Bye bye");
    }
}
