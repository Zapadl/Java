//Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите число A: ");
        double numA = user_input.nextDouble();

       System.out.println("Введите число B: ");
        double numB = user_input.nextDouble();
        System.out.println(numA);
        System.out.println(numB);

        System.out.println("Введите цифру: \n 1 - умножение \n 2 - сложение \n 3 - вычитание \n 4 - деление");
        int play = user_input.nextInt();
        if (play ==1)
            System.out.println(numA *numB);
        else if (play==2)
            System.out.println(numA + numB);
        else if (play==3)
            System.out.println(numA - numB);
        else if (play==4)
            System.out.println(numA/numB);
    }
}

