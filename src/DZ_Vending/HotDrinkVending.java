package DZ_Vending;
//—оздать класс √ор€чихЌапитковјвтомат реализующий интерфейс “орговыйјвтомат и
// реализовать перегруженный метод getProduct(int name, int volume, int temperature)
// выдающий продукт соответствующий имени, объему и температуре

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVending  {
    private List<Drink> drinkList;
    public  HotDrinkVending(List<Drink> drinksList) {
          this.drinkList = new ArrayList<>();
        }

    public void initProduct(Drink drink) {
        drinkList.add(drink);
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




    }


