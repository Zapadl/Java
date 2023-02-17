package Itogovaya;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private String model; //модель
    private Integer year; //год
    private String color; //цвет
    private String operatingSystem; // операционнная система
    private String cpu; //процессор
    private Integer hdd; //Жесткий диск
    private Integer ram; //ОЗУ
    private Double monitor; //диагонал экрана

    public Laptop(String model, Integer year, String color, String operatingSystem, String cpu, Integer hdd, Integer ram, Double monitor) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.monitor = monitor;
    }
//    public void setValues(String model, Integer year, String color, String operatingSystem, String cpu, Integer hdd, Integer ram, Double monitor) {
//        this.model = model;
//        this.year = year;
//        this.color = color;
//        this.operatingSystem = operatingSystem;
//        this.cpu = cpu;
//        this.hdd = hdd;
//        this.ram = ram;
//        this.monitor = monitor;
//    }

    public String printValues() {
        String info = "Модель: " + model + "\nГод: " + year + "\n Цвет: " + color + "\nОперационная система: " + operatingSystem +
                "\nПроцессор: " + cpu + "\nЖесткий диск: " + hdd + "\nОЗУ: " + ram + "\nДиагонал экрана: " + monitor;
        return info;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public Integer getHdd() {
        return hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public Double getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return getModel() + " " + getYear() + " " + getColor() + " " + getOperatingSystem() + " " + getCpu() + " " + getHdd() + " " + getRam() + " " + getMonitor();
    }


    public static void FilterLaptops(Set<Laptop> setNb) {
        HashMap<Integer, String> filters = new HashMap<>();
        filters.put(1, "Год выпуска");
        filters.put(2, "Цвет");
        filters.put(3, "Операционная система");
        filters.put(4, "Процессор");
        filters.put(5, "Объем жесткого диска");
        filters.put(6, "оперативная память");
        filters.put(7, "Размер экрана");
        System.out.println("Выберите параметры фильтрации: ");
        Scanner sc = new Scanner(System.in);

        filters.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        String filter = sc.nextLine();
        String[] nums = filter.split(" ");
        int[] intNums = new int[nums.length];
        HashMap<Integer, String> userFilters = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i]);
        }
        System.out.println("По вашему запросу: \n");
        for (var item : setNb) {
            StringBuilder sb = new StringBuilder();
            sb.append(item.getModel() + " ");
            for(int j = 0; j < intNums.length; j++) {
                if(intNums[j] == 1) {
                    sb.append(item.getYear());
                }
                else if(intNums[j] == 2) {
                    sb.append(item.getColor());
                }
                else if(intNums[j] == 3) {
                    sb.append(item.getOperatingSystem());
                }
                else if(intNums[j] == 4) {
                    sb.append(item.getCpu());
                }
                else if(intNums[j] == 5) {
                    sb.append(item.getHdd());
                }
                else if(intNums[j] == 6) {
                    sb.append(item.getRam());
                }
                else if(intNums[j] == 7) {
                    sb.append(item.getMonitor());
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
