package DZ_Vending;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("чай", 100,30,89);
        HotDrink latte = new HotDrink("Латте", 200,30,80);
        HotDrink cappuccino = new HotDrink("Капучино", 250,80,90);
        List<Drink> drinks = new ArrayList<>();
        HotDrinkVending hotDrinkVending = new HotDrinkVending(drinks);
        hotDrinkVending.initProduct(tea);
        hotDrinkVending.initProduct(latte);
        hotDrinkVending.initProduct(cappuccino);

        System.out.println(hotDrinkVending.getProduct("Капучино", 250,90));
}
}
