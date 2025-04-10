package design_patterns.creational.factoryMethod;

public class ChocolateFactory {
    public Chocolate createChocolate(String type){
        switch (type.toLowerCase()){
            case "lindt":
                return new LindtChocolate();
            case "poulain":
                return new PoulainChocolate();
            default:
                throw new IllegalArgumentException("Unkown weapon type: "+type);
        }
    }
}
