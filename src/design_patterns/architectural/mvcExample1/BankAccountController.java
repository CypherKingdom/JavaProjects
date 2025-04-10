package design_patterns.architectural.mvcExample1;

public class BankAccountController {
    private BankAccount model;
    private BankAccountView view;
   
    public BankAccountController(BankAccount model, BankAccountView view) {
        this.model = model;
        this.view = view;
    }

    public void deposit (double amount){
        if(amount<=0){
            this.view.displayMessage("Invalid amount");
        }
        else{
            this.model.deposit(amount);
            this.view.displayMessage("Deposit successful");
        }
    }

    public void withdraw (double amount){
        try{
            this.model.withdraw(amount);
            this.view.displayMessage("Withraw successful");
        }catch (Exception e){
            this.view.displayMessage(e.getMessage());
        }
    }

    public void getAccountDetails(){
        this.view.displayAccountDetails(this.model.getAccountHandler(), this.model.getBalance());
    }
}
