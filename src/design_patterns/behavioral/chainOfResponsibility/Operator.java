package design_patterns.behavioral.chainOfResponsibility;

public class Operator extends CustomerServiceAgent {

    @Override
    public void handle(Request request) {
        System.out.println("Operator will forward your request to an available basic operator");
        this.getNext().handle(request);
    }
}
