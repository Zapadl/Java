package Itogovaya;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop("Huawei", 2021,"Black","Windows 10","i5",250, 16,15.6);
             laptops.add(laptop1);
        Laptop laptop2 = new Laptop("Samsung", 2020,"White","Windows 10","i7",512, 32,16.0 );
             laptops.add(laptop2);
        Laptop laptop3 = new Laptop("Apple", 2021,"Black","Mac os","i5",250, 8,15.6 );
             laptops.add(laptop3);
        Laptop laptop4 = new Laptop("Samsung", 2019,"Black","Windows 10","i7",512, 32,16.0);
             laptops.add(laptop4);
        Laptop.FilterLaptops(laptops);



    }


}
