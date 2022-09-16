package MiniProjekat;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        WeightedIngredient wi1 = new WeightedIngredient("Jaja", 0, 15);
        WeightedIngredient wi2 = new WeightedIngredient("Brasno", 0, 90);
        WeightedIngredient wi3 = new WeightedIngredient("Mleko", 0, 150);
        WeightedIngredient wi4 = new WeightedIngredient("Jogurt", 0, 180);
        WeightedIngredient wi5 = new WeightedIngredient("Ulje", 0, 200);
        WeightedIngredient wi6 = new WeightedIngredient("Secer", 0, 90);
        WeightedIngredient wi7 = new WeightedIngredient("So", 0, 80);
        WeightedIngredient wi8 = new WeightedIngredient("Pasulj", 0, 300);
        WeightedIngredient wi9 = new WeightedIngredient("Kore za pitu", 0, 120);
        WeightedIngredient wi10 = new WeightedIngredient("Sir", 0, 450);
        WeightedIngredient wi11 = new WeightedIngredient("Prasak za pecivo", 0, 20);
        WeightedIngredient wi12 = new WeightedIngredient("Kakao", 0, 110);
        WeightedIngredient wi13 = new WeightedIngredient("Kukuruzno brasno", 0, 110);
        WeightedIngredient wi14 = new WeightedIngredient("Vanilin secer", 0, 30);
        WeightedIngredient wi15 = new WeightedIngredient("Plazma", 0, 340);
        WeightedIngredient wi16 = new WeightedIngredient("Slag", 0, 110);
        WeightedIngredient wi17 = new WeightedIngredient("Cokolada", 0, 110);
        WeightedIngredient wi18 = new WeightedIngredient("Pavlaka", 0, 150);

        WeightedIngredient[] listIngredients = {wi1, wi2, wi3, wi4, wi5, wi6, wi7, wi8, wi9, wi10,
                wi11, wi12, wi13, wi14, wi15, wi16, wi17, wi18};

        LinkedList<WeightedIngredient> omlet = new LinkedList<>();
        omlet.add(new WeightedIngredient("Jaja", 6, 15));
        omlet.add(new WeightedIngredient("Ulje", 0.1, 200));
        Recipe Omlet = new Recipe("Omlet", omlet);
        Omlet.status = Dificulty.BEGINNER;

        LinkedList<WeightedIngredient> vafli = new LinkedList<>();
        vafli.add(new WeightedIngredient("Jaja", 2, 15));
        vafli.add(new WeightedIngredient("Brasno", 0.3, 90));
        vafli.add(new WeightedIngredient("Ulje", 0.1, 200));
        vafli.add(new WeightedIngredient("Mleko", 0.25, 150));
        vafli.add(new WeightedIngredient("Vanilin secer", 0.1, 90));
        vafli.add(new WeightedIngredient("So", 0.1, 80));
        Recipe Vafli = new Recipe("Vafli", vafli);
        Vafli.status = Dificulty.MEDIUM;

        LinkedList<WeightedIngredient> plazmaKolac = new LinkedList<>();
        plazmaKolac.add(new WeightedIngredient("Plazma", 0.5, 340));
        plazmaKolac.add(new WeightedIngredient("Slag", 1, 110));
        plazmaKolac.add(new WeightedIngredient("Cokolada", 0.1, 110));
        plazmaKolac.add(new WeightedIngredient("Mleko", 0.1, 150));
        plazmaKolac.add(new WeightedIngredient("Pavlaka", 0.1, 150));
        Recipe PlazmaKolac = new Recipe("PlazmaKolac", plazmaKolac);
        PlazmaKolac.status = Dificulty.MEDIUM;

        LinkedList<WeightedIngredient> palacinke = new LinkedList<>();
        palacinke.add(new WeightedIngredient("Jaja", 2, 15));
        palacinke.add(new WeightedIngredient("Brasno", 0.5, 90));
        palacinke.add(new WeightedIngredient("Ulje", 0.1, 200));
        palacinke.add(new WeightedIngredient("Mleko", 0.1, 150));
        palacinke.add(new WeightedIngredient("Secer", 0.1, 90));
        palacinke.add(new WeightedIngredient("So", 0.1, 80));
        Recipe Palacinke = new Recipe("Palacinke", palacinke);
        Palacinke.status = Dificulty.EASY;

        LinkedList<WeightedIngredient> pita = new LinkedList<>();
        pita.add(new WeightedIngredient("Jaja", 6, 15));
        pita.add(new WeightedIngredient("Kore za pitu", 1, 120));
        pita.add(new WeightedIngredient("Sir", 0.3, 450));
        pita.add(new WeightedIngredient("Ulje", 0.1, 200));
        Recipe Pita = new Recipe("Pita", pita);
        Pita.status = Dificulty.MEDIUM;

        LinkedList<WeightedIngredient> pasulj = new LinkedList<>();
        pasulj.add(new WeightedIngredient("Pasulj", 1, 300));
        pasulj.add(new WeightedIngredient("So", 0.1, 80));
        Recipe Pasulj = new Recipe("Pasulj", pasulj);
        Pasulj.status = Dificulty.BEGINNER;

        LinkedList<WeightedIngredient> palenta = new LinkedList<>();
        palenta.add(new WeightedIngredient("Kukuruzno brasno", 0.5, 110));
        palenta.add(new WeightedIngredient("So", 0.1, 80));
        pita.add(new WeightedIngredient("Ulje", 0.1, 200));
        Recipe Palenta = new Recipe("Palenta", palenta);
        Palenta.status = Dificulty.MEDIUM;

        LinkedList<WeightedIngredient> mafini = new LinkedList<>();
        mafini.add(new WeightedIngredient("Jaja", 2, 15));
        mafini.add(new WeightedIngredient("Brasno", 0.3, 90));
        mafini.add(new WeightedIngredient("Ulje", 0.1, 200));
        mafini.add(new WeightedIngredient("Mleko", 0.2, 150));
        mafini.add(new WeightedIngredient("Secer", 0.1, 90));
        mafini.add(new WeightedIngredient("Prasak za pecivo", 1, 20));
        mafini.add(new WeightedIngredient("Kakao", 0.1, 110));
        Recipe Mafini = new Recipe("Mafini", mafini);
        Mafini.status = Dificulty.PRO;

        LinkedList<WeightedIngredient> proja = new LinkedList<>();
        proja.add(new WeightedIngredient("Jaja", 3, 15));
        proja.add(new WeightedIngredient("Brasno", 0.5, 90));
        proja.add(new WeightedIngredient("Ulje", 0.1, 200));
        proja.add(new WeightedIngredient("Sir", 0.3, 450));
        proja.add(new WeightedIngredient("Prasak za pecivo", 1, 20));
        Recipe Proja = new Recipe("Proja", proja);
        Proja.status = Dificulty.HARD;

        LinkedList<WeightedIngredient> krofnice = new LinkedList<>();
        krofnice.add(new WeightedIngredient("Jaja", 3, 15));
        krofnice.add(new WeightedIngredient("Brasno", 0.3, 90));
        krofnice.add(new WeightedIngredient("Ulje", 0.1, 200));
        krofnice.add(new WeightedIngredient("Vanilin secer", 0.1, 30));
        krofnice.add(new WeightedIngredient("Secer", 0.1, 90));
        krofnice.add(new WeightedIngredient("Jogurt", 0.1, 180));
        Recipe Krofnice = new Recipe("Krofnice", krofnice);
        Krofnice.status = Dificulty.MEDIUM;

        Recipe [] allRecipe = {Omlet, Vafli, PlazmaKolac, Palacinke, Pita, Pasulj, Palenta, Mafini, Proja, Krofnice};

        ArrayList<Recipe> favoriteRecipes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean go = true;
        while (go) {
            System.out.println("""
                    Unesite neku od opcija:\s
                    1 - Ukoliko zelite da dodate novu namirnicu u frizider
                    2 - Ukoliko zelite da obrisete neku od namirnica iz frizidera
                    3 - Ukoliko zelite da ispraznite frizider
                    4 - Ukoliko zelite da proverite koja sve jela mozete da napravite sa namirnicama iz frizidera
                        41 - Ukoliko zelite da proverite koja sve skalirana jela za 50% mozete da napravite
                    5 - Ukoliko zelite da napravite jelo
                        51 - Ukoliko zelite da napravite jelo skalirano za 50%
                    6 - Za pregled recepata koji mogu da se naprave za odredjenu cenu
                    7 - Za pregled recepta odredjene tezine
                    8 - Za pregled recepata odredjene tezine do odredjene cene
                    9 - Za sortiranje recepata po tezini
                    10 - Za sortiranje recepata po ceni
                    11 - Za omiljene recepte
                    0 - Za izlaz iz aplikacije""");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("Raspolozive namirnice su: ");
                for (var el : listIngredients) {
                    System.out.println(el.getId() + " " + el);
                }
                    boolean check = true;
                    while (check) {
                        System.out.println("Unesite redni broj namirnice koju zelite da dodate u frizider (0 za prekid): ");
                        int x = sc.nextInt();
                        if (x == 0) {
                            check = false;
                        } else {
                            Fridge.addToFridge(listIngredients[x - 1]);
                        }
                    }
            }
            if (input == 2) {
                Fridge.removeFromFridge();
            }
            if (input == 3) {
                Fridge.removeAllFromFridge();
            }
            if (input == 4) {
                System.out.println("Sledeca jela mozete napraviti sa namirnicama iz frizidera:");
                for (var el : allRecipe) {
                    if (Fridge.makingPossibility(el)) {
                        System.out.println(el);
                    }
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 41) {
                for (var el : allRecipe) {
                    Recipe.getScaledRp(el,50);
                }
                System.out.println("Sledeca skalirana jela za 50% mozete napraviti sa namirnicama iz frizidera:");
                for (var el : allRecipe) {
                    if (Fridge.makingPossibility(el)) {
                        System.out.println(el);
                    }
                }
                for (var el : allRecipe) {
                    Recipe.unscaleRp(el,50);
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 5) {
                System.out.println("Sledeci jela su na meniju: ");
                for (int i=0; i<allRecipe.length; i++) {
                    System.out.println(i+1 + " " + allRecipe[i].rpName);
                }
                System.out.println("Unesite redni broj jela koje zelite da napravite: ");
                int dishNmb = sc.nextInt();
                if (Fridge.makingPossibility(allRecipe[dishNmb-1])) {
                Fridge.makeDish(allRecipe[dishNmb-1]);}
                else {System.out.println("Nije moguce napraviti zadato jelo");}
            }
            if (input == 51) {
                System.out.println("Sledeci jela su na meniju: ");
                for (int i=0; i<allRecipe.length; i++) {
                    System.out.println(i+1 + " " + allRecipe[i].rpName);
                }
                System.out.println("Unesite redni broj jela koje zelite da napravite: ");
                int dishNmb = sc.nextInt();
                for (var el : allRecipe) {
                    Recipe.getScaledRp(el,50);
                }
                if (Fridge.makingPossibility(allRecipe[dishNmb-1])) {
                    Fridge.makeDish(allRecipe[dishNmb-1]);}
                else {System.out.println("Nije moguce napraviti zadato jelo");}
                for (var el : allRecipe) {
                    Recipe.unscaleRp(el, 50);
                }
            }
            if (input == 6) {
                System.out.println("Unesite maksimalnu cenu: ");
                double maxPrice = sc.nextDouble();
                System.out.println("Sledeca jela mogu da se naprave za " + maxPrice + " dinara:");
                for (Recipe recipe : allRecipe) {
                    if (recipe.getPrice() <= maxPrice) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 7) {
                System.out.println("Unesite 1-Begginer, 2-Easy, 3-Medium, 4-Hard, 5-Pro");
                int diff = sc.nextInt();
                switch (diff) {
                    case 1: for (var el : allRecipe) {if (el.status == Dificulty.BEGINNER)
                    {System.out.println(el);}} break;
                    case 2: for (var el : allRecipe) {if (el.status == Dificulty.EASY)
                    {System.out.println(el);}} break;
                    case 3: for (var el : allRecipe) {if (el.status == Dificulty.MEDIUM)
                    {System.out.println(el);}} break;
                    case 4: for (var el : allRecipe) {if (el.status == Dificulty.HARD)
                    {System.out.println(el);}} break;
                    case 5: for (var el : allRecipe) {if (el.status == Dificulty.PRO)
                    {System.out.println(el);}} break;
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 8) {
                System.out.println("Unesite 1-Begginer, 2-Easy, 3-Medium, 4-Hard, 5-Pro");
                int diff = sc.nextInt();
                System.out.println("Unesite maksimalnu cenu: ");
                double maxPrice = sc.nextDouble();
                System.out.println("Od recepata navedene tezine sa maksimalnom cenom od" + maxPrice + "mogu se napraviti: ");
                switch (diff) {
                    case 1: for (var el : allRecipe) {if (el.status == Dificulty.BEGINNER && maxPrice >= el.getPrice())
                    {System.out.println(el);}} break;
                    case 2: for (var el : allRecipe) {if (el.status == Dificulty.EASY && maxPrice >= el.getPrice())
                    {System.out.println(el);}} break;
                    case 3: for (var el : allRecipe) {if (el.status == Dificulty.MEDIUM && maxPrice >= el.getPrice())
                    {System.out.println(el);}} break;
                    case 4: for (var el : allRecipe) {if (el.status == Dificulty.HARD && maxPrice >= el.getPrice())
                    {System.out.println(el);}} break;
                    case 5: for (var el : allRecipe) {if (el.status == Dificulty.PRO && maxPrice >= el.getPrice())
                    {System.out.println(el);}} break;
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 9) {
                System.out.println("Tezina BEGGINER su: ");
                for (var el : allRecipe) {if (el.status == Dificulty.BEGINNER) {System.out.println(el);}}
                System.out.println("Tezina EASY su: ");
                for (var el : allRecipe) {if (el.status == Dificulty.EASY) {System.out.println(el);}}
                System.out.println("Tezina MEDIUM su: ");
                for (var el : allRecipe) {if (el.status == Dificulty.MEDIUM) {System.out.println(el);}}
                System.out.println("Tezina HARD su: ");
                for (var el : allRecipe) {if (el.status == Dificulty.HARD) {System.out.println(el);}}
                System.out.println("Tezina PRO su: ");
                for (var el : allRecipe) {if (el.status == Dificulty.PRO) {System.out.println(el);}}
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 10) {
                for (int i = 0; i < (allRecipe.length - 1); i++) {
                    for (int j = i + 1; j < allRecipe.length; j++)
                        if (allRecipe[i].getPrice() > allRecipe[j].getPrice()) {
                            Recipe temp = allRecipe[i];
                            allRecipe[i] = allRecipe[j];
                            allRecipe[j] = temp;
                        }
                }
                for (Recipe recipe : allRecipe) {
                    System.out.println(recipe + " " + recipe.getPrice());
                }
                System.out.println("Za nastavak pritisnite ENTER");
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
            }
            if (input == 11) {
                boolean goFav = true;
                while (goFav) {
                    System.out.println("""
                            Unesite:\s
                            1 - Za pregled omiljenih recepata
                            2 - Za dodavanje omiljenih recepata
                            3 - Za brisanje omiljenih recepata
                            4 - Za pregled omiljenih recepata koji mogu da se naprave do odredjene sume
                            0 - Za izlaz iz omiljenih recepata""");
                    int inputFav = sc.nextInt();
                    if (inputFav == 1) {
                        System.out.println("Omiljeni recepti su: ");
                        int i = 0;
                        for (var el : favoriteRecipes) {
                            i++;
                            System.out.println(i + " " + el.rpName);
                        }
                        System.out.println("Za nastavak pritisnite ENTER");
                        Scanner scan = new Scanner(System.in);
                        scan.nextLine();
                    }
                    if (inputFav == 2) {
                        System.out.println("Raspolozivi recepti su: ");
                        for (int i=0; i<allRecipe.length; i++) {
                            System.out.println(i+1 + " " + allRecipe[i].rpName);
                        }
                        System.out.println("Unesite redni broj recepta koje zelite da dodate u omiljene: ");
                        int x = sc.nextInt();
                        favoriteRecipes.add(allRecipe[x-1]);
                    }
                    if (inputFav == 3) {
                        for (int i=0; i<favoriteRecipes.size(); i++) {
                            System.out.println(i+1 + " " + favoriteRecipes.get(i).rpName);
                        }
                        System.out.println("Unesite redni broj recepta koji zelite da izbacite iz omiljenih: ");
                        int x = sc.nextInt();
                        favoriteRecipes.remove(favoriteRecipes.get(x-1));
                    }
                    if (inputFav == 4) {
                        System.out.println("Unesite maksimalnu cenu: ");
                        double maxPrice = sc.nextDouble();
                        System.out.println("Recepti koji mogu da se naprave za iznos do " + maxPrice + " dinara, su: ");
                        for (var el : favoriteRecipes) {
                            if (el.getPrice() <= maxPrice) {
                                System.out.println(el);
                            }
                        }
                        System.out.println("Za nastavak pritisnite ENTER");
                        Scanner scan = new Scanner(System.in);
                        scan.nextLine();
                    }
                    if (inputFav == 0) {goFav = false;}
                }
            }
            if (input == 0) {go = false;}
        }
    }
}

