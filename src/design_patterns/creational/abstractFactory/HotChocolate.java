package design_patterns.creational.abstractFactory;

public abstract class HotChocolate {
    public String ingredients;

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void prepare();
}
