package Pattern.MVC.model;



import Pattern.MVC.service.VendingInterface;


public class Tea implements VendingInterface {
    @Override
    public void drink() {
        System.out.println("Ваш чай готов, заберите");
    }
}

