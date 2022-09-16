package MiniProjekat;

public class WeightedIngredient extends Ingredient {
    int id;
    String ingredientName;
    double weight;
    double pricePerUnit;
    static int count;

    public WeightedIngredient (String ingredientName, double weight, double pricePerUnit) {
        this.ingredientName = ingredientName;
        this.pricePerUnit = pricePerUnit;
        this.weight = weight;
        count ++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight*pricePerUnit;
    }

    @Override
    public String toString() {
        return " " + ingredientName;
    }
}
