package DZ_Vending.Drinks;

import DZ_Vending.MainVending;


import java.util.ArrayList;
import java.util.List;

public abstract class Drink implements MainVending {
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
        setNameInternal(name);
    }
    protected abstract void setNameInternal(String name);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        setPriceInternal(price);
    }
    protected abstract void setPriceInternal(int price);
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        setVolumeInternal(volume);
    }
    protected abstract void setVolumeInternal(int volume);
    @Override
    public String toString() {
        return name;
    }


}
