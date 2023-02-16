package dz_les5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> TelefonBook = new HashMap<String, ArrayList<String>>();
        Scanner sc = new Scanner(System.in);
        int menuin = 0;
        while(true) {
            while(true) {
                try {
                    System.out.println("Выберите пункт меню: ");
                    System.out.println("1. Просмотр телефонной книги");
                    System.out.println("2. Добавление записи");
                    System.out.println("3. Выход из меню \n");
                    menuin = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Введите верное число!");
                    e.printStackTrace();
                }
            }
            if (menuin == 1) {
                if (TelefonBook.size()==0) {
                    System.out.println("Телефонная книга пуста \n");
                }
                else {
                    TelefonBook.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    });
                }

            }
            else if (menuin == 2) {
                System.out.println("Введите имя контакта: \n");
                String name = sc.next();
                while (true) {
                    if (TelefonBook.containsKey(name)) {
                        System.out.println("Контакт с таким именем уже существует, хотите добавить номер телефона? \n 1. ДА \n 2. НЕТ");
                        String inp = sc.next();
                        if (inp.equals("1")) {
                            System.out.println("Введите номер телефона: \n");
                            String number = sc.next();
                            addToList(name, number, TelefonBook);
                            break;
                        }
                        else break;
                    }
                    else {
                        System.out.println("Введите номер телефона: \n");
                        String number = sc.next();
                        addToList(name, number, TelefonBook);
                        break;
                    }
                }
            }
            else {
                sc.close();
                break;
            }
        }

    }
    public static void addToList(String mapKey, String myItem, HashMap<String, ArrayList<String>> pb) {
        ArrayList<String> itemsList = pb.get(mapKey);
        if(itemsList == null) {
            itemsList = new ArrayList<String>();
            itemsList.add(myItem);
            pb.put(mapKey, itemsList);
        } else {
            if(!itemsList.contains(myItem)) itemsList.add(myItem);
        }
    }
}

//        List<String> One = new ArrayList<String>();
//        One.add("7(917)408-9632");
//        One.add("7(917)519-7357");
//        TelefonAndNames.put("Рыбаков Юрий Авдеевич", One);
//        System.out.println(TelefonAndNames);
//        List<String> Two = new ArrayList<String>();
//        Two.add("3");
//        Two.add("4");
//        System.out.println(TelefonAndNames);
