package practice.stock;

public abstract class StockMarket {
    public abstract EnergyStock creaEnergyStock(String name, double price);
    public abstract TechStock creaTechStock(String name, double price);
    public abstract FinanceStock creaFinanceStock(String name, double price);
}
