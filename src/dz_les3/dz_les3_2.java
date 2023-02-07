package dz_les3;
//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;

public class dz_les3_2 {
    public static void main(String[] params) {
        ArrayList<Integer> array = new ArrayList<>();

        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(20) +10; i++) {
            array.add(rd.nextInt(100) + 1);
        }
        System.out.println(array);

        array.removeIf(x -> x % 2 == 0);
        System.out.println(array);
    }



}
