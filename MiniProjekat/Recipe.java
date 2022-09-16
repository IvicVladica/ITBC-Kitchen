package MiniProjekat;

import java.util.*;


public class Recipe implements Priceble{
   String rpName;
    List<WeightedIngredient> rpIngredients = new LinkedList<>();

    public Recipe (String rpName, List<WeightedIngredient> rpIngredients) {
        this.rpName = rpName;
        this.rpIngredients = rpIngredients;
    }
    public Dificulty status;

    public void addIngredientToRp (WeightedIngredient inputWI) {
        System.out.println("Unesite kolicinu koju zelite da dodate u Recept: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        inputWI.setWeight(x);
        rpIngredients.add(inputWI);
    }
    public void removeFromRp() {
        for (var el : rpIngredients) {
            System.out.println(el.getId() + " " + el + " " + el.getWeight());
        }
        System.out.println("Unesite redni broj namirnice koju zelite da izbacite iz recepta:  ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        rpIngredients.removeIf(el -> y == el.getId());
    }
    public static Recipe getScaledRp (Recipe x, double y) {
    //    String newName = x.rpName + " " + y + "%";
        Recipe outputRp = new Recipe("",new LinkedList<>());
        LinkedList<WeightedIngredient> outputList = new LinkedList<>(x.rpIngredients);
        for (var el : outputList) {
            el.setWeight(el.weight/(100/y));
        }
        outputRp = new Recipe(x.rpName, outputList);
       return outputRp;
    }

    public static Recipe unscaleRp (Recipe x, double y) {
        Recipe outputRp = new Recipe("",new LinkedList<>());
        LinkedList<WeightedIngredient> outputList = new LinkedList<>(x.rpIngredients);
        for (var el : outputList) {
            el.setWeight(el.weight*(100/y));
        }
        outputRp = new Recipe(x.rpName, outputList);
        return outputRp;
    }



    @Override
    public double getPrice() {
        double price = 0;
        for (var el : rpIngredients) {
            price = price + el.getPrice();
        }
        return price;
    }

    public List<WeightedIngredient> getRpIngredients() {
        return rpIngredients;
    }

    @Override
    public String toString() {
        return rpName + ": " + rpIngredients;
    }
}
