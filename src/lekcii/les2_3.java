package lekcii;

import java.util.Scanner;

//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class les2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String s = input.trim().replace(" ", "");
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        if (sb.toString().equals(s)) {
            System.out.println("Полиндром");
        } else System.out.println("Нет");
        /*
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        int size =str.length();
        boolean bol=true;
        for (int i = 0; i <size/2; i++) {
            if (str.charAt(i) !=str.charAt(size-1-i)) {
                bol = false;
                break;
            }
        }
        System.out.println(bol);
        */

    }
}
