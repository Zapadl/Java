package DZ_Vending.Drinks;

public class HotDrink extends Drink {
    protected int temperature;

    public HotDrink(String name, int volume, int price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
        temperatureInternal(temperature);
    }
    protected void temperatureInternal(int temperature) {}

    public int getTemperature() {
        return temperature;
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
