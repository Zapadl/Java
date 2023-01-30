package dz_les1;//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class dz1_task1 {
    public static void main(String[] args)  {
            Scanner user_input = new Scanner(System.in);
            System.out.println("Введите число N: ");
            int numN = user_input.nextInt();

            int result = 0;
            for (int i=1; i <= numN;i++){
            result += i;
            }



            System.out.println("Сумма чисел от 1 до " +numN + ": " +result);
             double result1 = 1;
             for (int i=1; i <= numN;i++){
                result1 *= i;
             }

              System.out.println("Произведение чисел от 1 до " +numN + ": " +result1);
    }
}







