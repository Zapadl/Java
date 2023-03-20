package Pattern.MVC.view;

import Pattern.MVC.controller.FactoryController;
import Pattern.MVC.service.Fill;

import java.util.Scanner;

public class ConsoleView implements ViewInterface{
    private final FactoryController controller = new FactoryController();

    @Override
    public void orderDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите напиток");
        for (Fill filling : Fill.values()) {
            System.out.println(filling.ordinal() + " " + filling);
        }

        int choice = scanner.nextInt();

        System.out.println("Количество: ");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            controller.eatDrink(Fill.values()[choice]);
        }

        controller.showOrder();
    }

}

