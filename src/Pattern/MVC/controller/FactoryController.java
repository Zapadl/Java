package Pattern.MVC.controller;
import Pattern.MVC.model.DrinkFactory;
import Pattern.MVC.service.Fill;


    public class FactoryController {

        DrinkFactory factory = new DrinkFactory();

        public void eatDrink(Fill filling) {

            factory.getDrink(filling).drink();
        }

        public void showOrder() {

            factory.printCounts();
        }

    }

