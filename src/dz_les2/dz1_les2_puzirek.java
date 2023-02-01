package dz_les2;

import java.io.FileWriter;
import java.io.IOException;

public class dz1_les2_puzirek{
    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubbleSort(array);
        System.out.println(arrayToString(array));
    }

    public static void bubbleSort(int[] array)  {
        boolean isSorted = false;
        while (!isSorted) {
            try (FileWriter writer =new FileWriter("./src/dz_les2/sort.txt", true)) {
                String text = arrayToString(array);
                writer.append(text);
                writer.append("\n");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;

                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");

        return sb.toString();
    }


}
