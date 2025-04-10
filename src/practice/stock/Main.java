package practice.stock;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockService();
        Stock stock1 = stockMarket.creaTechStock("Apple", 10);
        Stock stock2 = stockMarket.creaFinanceStock("JPMorgan", 20);
        Stock stock3 = stockMarket.creaEnergyStock("Total", 15);
    
        Analyst analyst1 = new Analyst("Mario", "mario@gmail.com", "123");
        Analyst analyst2 = new Analyst("Toni", "toni@gmail.com", "456");
        
        Tracker tracker = new Tracker();
        tracker.addStock(stock1);
        tracker.addStock(stock2);
        tracker.addStock(stock3);
        tracker.subscribe(stock1, analyst1);
        tracker.subscribe(stock1, analyst2);
        tracker.subscribe(stock2, analyst2);
        tracker.subscribe(stock3, analyst1);
        tracker.notify(stock1, 20);
    }
}
