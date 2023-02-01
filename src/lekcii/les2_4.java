package lekcii;

import java.io.FileWriter;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class les2_4 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("Test ");
            }
        try (FileWriter writer =new FileWriter("Log")){
            //запись всей строки
            String text = sb.toString();
            writer.write(text);
            //запись по символам
//            writer.append("\n");
//            writer.append("E");
        }catch (Exception exception){
            System.out.println("какая та блять ошибка");
        }
        Logger logger = Logger.getAnonymousLogger();
        logger.info("ну типа готово");
    }
}

