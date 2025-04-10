package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Box implements Item {
    private ArrayList<Item> items = new ArrayList<Item>();
    private String name;

    public void addItem(Item item){
        this.items.add(item);
    }

    public Box(String name) {
        this.name = name;
    }

    @Override
    public double calculatePrice() {
        double total = 0;
        for(Item i:items){
            total+=i.calculatePrice();
        }
        return total;
    }

    @Override
    public void removeItem(Item item) {
        if(this.items.contains(item))
            this.items.remove(item);
    }

    @Override
    public void print() {
       System.out.println("Box [name=" + name);

       Iterator<Item> iter = this.items.iterator();
        while(iter.hasNext()){
            Item item = iter.next();
            item.print();
        }
        System.out.println("]");
    }
}
