package Pattern.MVC.model;

import Pattern.MVC.service.VendingInterface;

public class Limonade implements VendingInterface {
    @Override
    public void drink() {
        System.out.println("Ваш лимонад готов, заберите");
    }
}