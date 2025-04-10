package design_patterns.behavioral.chainOfResponsibility;

public abstract class CustomerServiceAgent {
    private CustomerServiceAgent next;

    public CustomerServiceAgent getNext() {
        return next;
    }

    public void setNext(CustomerServiceAgent next) {
        this.next = next;
    }

    public abstract void handle(Request request);
}
