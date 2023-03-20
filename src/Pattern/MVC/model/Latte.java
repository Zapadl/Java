package Pattern.MVC.model;


import Pattern.MVC.service.VendingInterface;

public class Latte implements VendingInterface {
    @Override
    public void drink() {
        System.out.println("Ваш Латте готов, заберите");
    }
}
