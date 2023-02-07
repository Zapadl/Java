package dz_les3;

import java.util.*;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
public class dz_les3_3 {
    public static void main(String[] params) {
    List<Integer> array = new ArrayList<>();

        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(5) +3; i++) {
            array.add(rd.nextInt(100) + 1);
        }
        System.out.println(array);
        Integer max = array.stream().max(Integer::compare).get();
        System.out.printf("Максимальное значение: " +max +"\n");
        Integer min = array.stream().min(Integer::compare).get();
        System.out.printf("Минимальное значение: "+min +"\n");
//        IntSummaryStatistics avg = array.stream().mapToInt((a) -> a);
        IntSummaryStatistics iss = array.stream().mapToInt((a) -> a).summaryStatistics();
        System.out.printf("Среднее арифметическое: " + iss.getAverage());
    }
}
//