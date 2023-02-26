package DZ_Vending;

public class HotDrink extends Drink {
    protected int temperature;

    public HotDrink(String name, int volume, int price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
