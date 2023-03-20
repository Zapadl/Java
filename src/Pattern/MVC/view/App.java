package Pattern.MVC.view;

public class App {

    ViewInterface view;

    public App(ViewInterface view) {
        this.view = view;
    }

    public void start() {
        view.orderDrink();
    }
}