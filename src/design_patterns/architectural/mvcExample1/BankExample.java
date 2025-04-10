package design_patterns.architectural.mvcExample1;

public class BankExample {
    public static void main(String[] args) {
        BankAccount model = new BankAccount("Joe Joe", 10000);

        BankAccountView view = new BankAccountView();
        BankAccountController controller = new BankAccountController(model, view);

        controller.deposit(70);
        controller.withdraw(20000);
        controller.withdraw(90);

        controller.getAccountDetails();
    }
}
