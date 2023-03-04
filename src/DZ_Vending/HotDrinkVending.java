package DZ_Vending;
//������� ����� ���������������������� ����������� ��������� ��������������� �
// ����������� ������������� ����� getProduct(int name, int volume, int temperature)
// �������� ������� ��������������� �����, ������ � �����������

import DZ_Vending.Drinks.Drink;
import DZ_Vending.Drinks.HotDrink;
import Vending.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVending implements MainVending<HotDrink> {
    private List<HotDrink> drinkList;
    public  HotDrinkVending() {
          this.drinkList = new ArrayList<>();
        }
    public void initProduct(HotDrink drink) {
        drinkList.add(drink);
    }



    @Override
    public HotDrink getProduct(String name) {
        return null;
    }

    protected HotDrink getProduct(String  name, int volume, int temperature) {
        for (Drink drink : drinkList) {
           if (drink instanceof HotDrink) {
               HotDrink hotDrink = (HotDrink) drink;
               if (hotDrink.getName().equals(name) && hotDrink.getVolume()==volume && hotDrink.getTemperature() == temperature ) {
                   return hotDrink;
               }
           }
           else return null;
        }
        return null;
    }

    @Override
    public String toString() {
        return drinkList.toString();
    }
}


