package design_patterns.behavioral.chainOfResponsibility;

public class Demo {

    public static void main(String[] args) {
        CustomerServiceAgent operator = new Operator();
        //Building the chain of responsibility
        CustomerServiceAgent basicSupport = new BasicSupport();        
        CustomerServiceAgent techSupport = new TechSupport();
        operator.setNext(basicSupport);
        basicSupport.setNext(techSupport);
        //operator<<basicSupport<<techSupport

        Request request = new Request("connectivity", "No internet", "John Doe");
        operator.handle(request);
    }
}
