package DZ_Vending;

import DZ_Vending.Drinks.Drink;

import java.util.Iterator;
import java.util.List;

public class DrinkIterator implements Iterator<Drink> {
        private List<Drink> drinks;
        private int index;
        public DrinkIterator(List<Drink> drinks){
            this.drinks = drinks;
        }

        @Override
        public boolean hasNext() {
            return index  < drinks.size();
        }
        @Override
         public Drink next() {
            return drinks.get(index++);
        }


}
