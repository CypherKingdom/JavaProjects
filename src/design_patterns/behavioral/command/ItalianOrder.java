package design_patterns.behavioral.command;

public class ItalianOrder implements Order {
    private Chef chef;

    public ItalianOrder(Chef chef){
        this.chef = chef;
    }
    
    @Override
    public void execute() {
        chef.prepItalian();
    }
}
