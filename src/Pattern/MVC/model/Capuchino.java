package Pattern.MVC.model;

import Pattern.MVC.service.VendingInterface;

public class Capuchino implements VendingInterface {
    @Override
    public void drink() {
        System.out.println("Ваш капучино готов, заберите");
    }
}
