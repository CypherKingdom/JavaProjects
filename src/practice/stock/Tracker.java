package practice.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tracker {
    private ArrayList<Stock> stocks = new ArrayList<Stock>();
    private HashMap<Stock, List<Analyst>> subscribers = new HashMap<Stock, List<Analyst>>();

    public void addStock(Stock stock) {
        for(Stock stocksample : stocks){
            if(stocksample.getName().equals(stock.getName()) && stocksample.getType().equals(stock.getType())){
                System.out.println("Stock already exists..");
                return;
            }
        }
        this.stocks.add(stock);
    }

    public void subscribe(Stock stock, Analyst analyst) {
        List<Analyst> list = this.subscribers.get(stock);
        if (list == null) {
            list = new ArrayList<Analyst>();
            this.subscribers.put(stock, list);
        }
        list.add(analyst);
    }

    public void unsubscribe(Stock stock, Analyst analyst) {
        List<Analyst> list = this.subscribers.get(stock);
        if (list == null) {
            System.out.println("Cannot unsubscribe. Subscription does not exist!");
            return;
        }
        list.remove(analyst);
    }

    public void notify(Stock stock, double newPrice) {
        List<Analyst> list = this.subscribers.get(stock);
        stock.setPrice(newPrice);
        for (Analyst analyst : list)
            analyst.update(stock);
    }
}
