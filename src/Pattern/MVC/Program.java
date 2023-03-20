package Pattern.MVC;

import Pattern.MVC.view.App;
import Pattern.MVC.view.ConsoleView;

public class Program {
    public static void main(String[] args) {

        App drinkFactoryApp = new App(new ConsoleView());
        drinkFactoryApp.start();
    }
}