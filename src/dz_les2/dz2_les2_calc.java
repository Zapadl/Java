package dz_les2;

import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class dz2_les2_calc {

        public static void main(String[] args){
            try (FileWriter writer =new FileWriter("./src/dz_les2/calc.txt", true)) {
                writer.append("--------------начало операции------------\n");
                Scanner user_input = new Scanner(System.in);
                System.out.println("Введите число A: ");
                double numA = user_input.nextDouble();
                writer.append("Введите число A: " + Double.toString(numA)+"\n");

                System.out.println("Введите число B: ");
                double numB = user_input.nextDouble();
                writer.append("Введите число B: " + Double.toString(numB)+"\n");
                System.out.println(numA);
                System.out.println(numB);

                System.out.println("Введите цифру: \n 1 - умножение \n 2 - сложение \n 3 - вычитание \n 4 - деление");
                int play = user_input.nextInt();
                writer.append("Введите цифру: \n 1 - умножение \n 2 - сложение \n 3 - вычитание \n 4 - деление \n Вы выбрали: " + Integer.toString(play) +"\n");
                if (play == 1) {
                    Double multiplication = numA * numB;
                    System.out.println(multiplication);
                    writer.append("Результат умножения: "+Double.toString(multiplication)+"\n");
                     }
                else if (play == 2) {
                    Double sum = numA + numB;
                    System.out.println(sum);
                    writer.append("Результат сложения: "+Double.toString(sum)+"\n");
                }
                else if (play == 3) {
                    Double sub = numA - numB;
                    System.out.println(sub);
                    writer.append("Результат вычитания: "+ Double.toString(sub)+"\n");
                }
                else if (play == 4) {
                    Double div = numA / numB;
                    System.out.println(div);
                    writer.append("Результат деления: "+Double.toString(div)+"\n");
                }
                writer.append("--------------конец операции------------\n");
            }catch (Exception exception){};
        }
}
