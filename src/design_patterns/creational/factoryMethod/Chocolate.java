package design_patterns.creational.factoryMethod;

public abstract class Chocolate {
    private double cacaoPercentage;
    private double sugarPercentage;

    public double getCacaoPercentage() {
        return cacaoPercentage;
    }
    public void setCacaoPercentage(double cacaoPercentage) {
        this.cacaoPercentage = cacaoPercentage;
    }
    public double getSugarPercentage() {
        return sugarPercentage;
    }
    public void setSugarPercentage(double sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }
    public abstract void eat();
}
