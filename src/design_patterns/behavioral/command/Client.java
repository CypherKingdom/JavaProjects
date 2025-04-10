package design_patterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        waiter.takeOrder(new ItalianOrder(chef));
        waiter.takeOrder(new SushiOrder(chef));

        waiter.executeOrders();
    }
}
