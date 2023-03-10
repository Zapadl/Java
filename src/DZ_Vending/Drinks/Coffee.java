package DZ_Vending.Drinks;

public class Coffee extends Drink {

    public Coffee(String name, int volume, int price) {
        super(name, volume, price);
    }

    @Override
    protected void setNameInternal(String name) {

    }

    @Override
    protected void setPriceInternal(int price) {

    }

    @Override
    protected void setVolumeInternal(int volume) {

    }

    @Override
    public void initProduct(Object product) {

    }

    @Override
    public Object getProduct(String name) {
        return null;
    }
}
