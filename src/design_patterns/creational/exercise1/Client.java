package design_patterns.creational.exercise1;

public class Client {
    public static void main(String[] args) {
        Bank bank = new PersonalService();
        Account account = bank.createCheckingAccount("Mario Abdel Khalek", 10000);
        account.printSummary();
    }
}
