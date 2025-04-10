package design_patterns.behavioral.template;

public abstract class OnlineOrdering {
    //Template methood
    public void purchase() {
        //Define order of steps
        this.selectItems();
        this.addToCart();
        this.pay();
    }

    //step 1
    public abstract void selectItems();

    //step 2
    public void addToCart(){
        System.out.println("Adding to cart");   
    }

    //step 3
    public void pay() {
        System.out.println("Paying by credit card");
    }
}
