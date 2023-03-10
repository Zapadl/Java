package DZ_Vending;


import DZ_Vending.Drinks.Coffee;
import DZ_Vending.Drinks.Drink;
import DZ_Vending.Drinks.HotDrink;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import static DZ_Vending.HotDrinkVending.moveDrink;

public class Main {
    public static void main(String[] args) {


        List<Drink> drinks = new ArrayList<>();
        HotDrink green = new HotDrink("Зеленый чай", 100,30,89);
        HotDrink black = new HotDrink("Черный чай", 100,30,89);
        Coffee latte = new Coffee("Латте", 200,30);
        Coffee cappuccino = new Coffee("Капучино", 250,80);

        List<HotDrink> TeaDrinks = new ArrayList<>();
        TeaDrinks.add(green);
        TeaDrinks.add(black);

        List<Coffee> CoffeeDrinks = new ArrayList<>();
        CoffeeDrinks.add(latte);
        CoffeeDrinks.add(cappuccino);

        HotDrinkVending hotDrinkVending = new HotDrinkVending();
        hotDrinkVending.initProduct(green);
        hotDrinkVending.initProduct(black);
//        hotDrinkVending.initProduct(cappuccino);
        moveDrink(CoffeeDrinks, drinks);
        moveDrink(TeaDrinks, drinks);

        System.out.println("Запрос по параметрам:");
        System.out.println(hotDrinkVending.getProduct("Черный чай", 100,89));
//        System.out.println(hotDrinkVending);



        System.out.println("\n Печать напитков в листе:");
        Iterator<Drink> iterator = new DrinkIterator(drinks);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
}


}
