package Pattern.MVC.model;


import Pattern.MVC.service.VendingInterface;
import Pattern.MVC.service.Fill;

public class DrinkFactory {

    private int latteCount;
    private int capuchinoCount;
    private int limonadeCount;
    private int teaCount;

    public VendingInterface getDrink(Fill type) {

        VendingInterface toReturn;

        switch (type) {
            case Latte -> {
                latteCount++;
                toReturn = new Latte();
            }
            case Capuchino -> {
                capuchinoCount++;
                toReturn = new Capuchino();
            }
            case Limonade -> {
                limonadeCount++;
                toReturn = new Limonade();
            }
            case Tea -> {
                teaCount++;
                toReturn = new Tea();
            }

            default -> throw new IllegalArgumentException ("Такой напиток закончился " + type);
        }
        return toReturn;
    }

    public void printCounts(){
        System.out.println("Ваш Заказ: ");
        System.out.println("Латте: " + latteCount);
        System.out.println("Капучино: " +  capuchinoCount);
        System.out.println("Лимонад: " + limonadeCount);
        System.out.println("Чай: " + teaCount);
    }
}