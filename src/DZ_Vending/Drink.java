package DZ_Vending;

public class Drink {
    private String name;
    private int price;
    private int volume;

    public Drink(String name, int volume, int price) {
        this.name = name;
        this.price = price;
        this.volume =volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name;
    }


}
