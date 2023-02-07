package dz_les3;
//Реализовать алгоритм сортировки слиянием
import java.util.Arrays;
import java.util.Random;

public class dz_les3_1 {

    public static void main(String[] params) {
        Random random = new Random();
        int[] a = random.ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(a));
        SortUnsorted(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void SortUnsorted(int[] a, int startA, int endA) {

        if (endA <= startA)
            return;
        int mid = startA + (endA - startA) / 2;
        SortUnsorted(a, startA, mid);
        SortUnsorted(a, mid + 1, endA);

        int[] buf = Arrays.copyOf(a, a.length);


        for (int k = startA; k <= endA; k++)
            buf[k] = a[k];

        int i = startA, j = mid + 1;
        for (int k = startA; k <= endA; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > endA) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }

    }

}

