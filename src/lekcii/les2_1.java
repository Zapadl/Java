package lekcii;
//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class les2_1 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите четное число: \n");
        int n = user_input.nextInt();
        String c1 = "c1";
        String c2 = "c2";
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i <= n ; i+=2) {
            sb.append(c1+c2);
        }
        System.out.println(sb);

        }
}
