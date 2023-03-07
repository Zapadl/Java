package DZ_Vending;


import DZ_Vending.Drinks.Drink;
import DZ_Vending.Drinks.HotDrink;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("чай", 100,30,89);
        HotDrink latte = new HotDrink("Латте", 200,30,80);
        HotDrink cappuccino = new HotDrink("Капучино", 250,80,90);


        List<Drink> drinks = new ArrayList<>();
        drinks.add(tea);
        drinks.add(latte);
        drinks.add(cappuccino);

        HotDrinkVending hotDrinkVending = new HotDrinkVending();
        hotDrinkVending.initProduct(tea);
        hotDrinkVending.initProduct(latte);
        hotDrinkVending.initProduct(cappuccino);


//        System.out.println(hotDrinkVending);
//        System.out.println(hotDrinkVending.getProduct("Капучино", 250,90));
//        System.out.println(hotDrinkVending);

        Iterator<Drink> iterator = new DrinkIterator(drinks);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
}
}
