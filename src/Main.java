import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите Имя: ");
        Scanner iScanner = new Scanner(System.in);

        Date dateNow =new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss a zzz");


        String name = iScanner.nextLine();
        System.out.println("Привет! "+name +formatForDateNow.format(dateNow));

    }
}
w