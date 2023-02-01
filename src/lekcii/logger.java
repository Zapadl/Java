package lekcii;

import java.io.FileWriter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;

public class logger {
     public static void main(String[] args) {
      try (FileWriter writer =new FileWriter("Log")){
          //запись всей строки
          String text = "какой то текст";
          writer.write(text);
          //запись по символам
          writer.append("\n");
          writer.append("E");
      }catch (Exception exception){}
         Logger logger = Logger.getAnonymousLogger();
         logger.info("какая та блять ошибка");
    }
}
