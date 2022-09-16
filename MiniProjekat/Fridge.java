package MiniProjekat;

import java.util.*;

public class Fridge {


    static final List<WeightedIngredient> zalihe = new LinkedList<>();


    public static void addToFridge(WeightedIngredient x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite kolicinu: ");
        double qt = sc.nextDouble();
        for (var el : zalihe) {
            if (el.ingredientName.equals(x.ingredientName)) {
                qt = x.weight + qt;
                el.setWeight(qt);
                zalihe.remove(el);
                break;
            }
        }
        x.setWeight(qt);
        zalihe.add(x);
        System.out.println("Novo stanje je: ");
        for (var el : zalihe) {
            System.out.println(el.getId() + " " + el + " " + el.getWeight());}
    }

    public static void removeFromFridge()  {
        System.out.println("Namirnice u frizideru su: ");
       for (var el : zalihe) {
            System.out.println(el.getId() + " " + el + " " + el.getWeight());}
            System.out.println("Unesite redni broj namirnice koju zelite da izbacite iz frizidera ");
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
        zalihe.removeIf(el -> y == el.getId());
        System.out.println("Novo stanje je: ");
        for (var el : zalihe) {
            System.out.println(el.getId() + " " + el + " " + el.getWeight());
            System.out.println("Za nastavak pritisnite ENTER");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
        }
    }
    public static void removeAllFromFridge() {
        zalihe.clear();
        System.out.println("Frizider je prazan! (Tj. samo je predsednik u njemu)");
        System.out.println("Za nastavak pritisnite ENTER");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        }

    public static boolean makingPossibility (Recipe x) {
        boolean check = false;
        int trueCount = 0;
        for (var el : x.rpIngredients) {
            for (var el1 : zalihe) {
                if (el.ingredientName.equals(el1.ingredientName) && el.weight < el1.weight) {
                        trueCount++;
                }
            }
        }
        if (trueCount == x.rpIngredients.size()) {check = true;}
        return check;
    }
    public static void makeDish (Recipe x) {
        for (var elRp : x.rpIngredients) {
            for (var elFr : zalihe) {
                if (elRp.ingredientName.equals(elFr.ingredientName)) {
                    elFr.weight = elFr.weight - elRp.weight;
                }
            }
        }
        System.out.println("Napravljeno je jelo: " + x.rpName + ", Novo stanje u frizideru je: ");
        for (var el : zalihe) {
            System.out.println(el.getId() + " " + el + " " + el.getWeight());}
        System.out.println("Za nastavak pritisnite ENTER");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}






