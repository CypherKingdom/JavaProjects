package practice.stock;

public class StockService extends StockMarket {
    @Override
    public EnergyStock creaEnergyStock(String name, double price){
        return new EnergyStock(name, price);
    }

    @Override
    public TechStock creaTechStock(String name, double price){
        return new TechStock(name, price);
    }

    @Override
    public FinanceStock creaFinanceStock(String name, double price){
        return new FinanceStock(name, price);
    }
}
