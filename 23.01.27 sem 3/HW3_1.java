import java.util.Arrays;
import java.util.Random;

// Реализовать алгоритм сортировки слиянием
public class HW3_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[rand.nextInt(20)];
        int[] array2 = new int[rand.nextInt(20)];
        int[] array_sum = new int[array1.length+array2.length];
        fillArrai(array1);
        fillArrai(array2);
        printArray(array1);
        printArray(array2);
        mergSorted(array1, 0, array1.length-1);
        mergSorted(array2, 0, array2.length-1);
        printArray(array1);
        printArray(array2);
        int i=0, j=0;
        for (int k=0; k<array_sum.length; k++) {
    
            if (i > array1.length-1) {
                int a = array2[j];
                array_sum[k] = a;
                j++;
            }
            else if (j > array2.length-1) {
                int a = array1[i];
                array_sum[k] = a;
                i++;
            }
            else if (array1[i] < array2[j]) {
                int a = array1[i]; 
                array_sum[k] = a;
                i++;
            }
            else {
                int b = array2[j];
                array_sum[k] = b;
                j++;
            }
        }
        printArray(array_sum);
    }
    public static void fillArrai(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100);
        }
    }
    public static void printArray(int[] a) {
        for (var el : a){
            System.out.print(el + " ");
    }
    System.out.println();
}
private static void mergSorted(int[] a, int lo, int hi) {

    if (hi <= lo)
        return;
    int middle = lo + (hi - lo) / 2;
    mergSorted(a, lo, middle);
    mergSorted(a, middle + 1, hi);

    int[] buffer = Arrays.copyOf(a, a.length);

    for (int o = lo; o <= hi; o++)
        buffer[o] = a[o];

    int i = lo, j = middle + 1;
    for (int k = lo; k <= hi; k++) {

        if (i > middle) {
            a[k] = buffer[j];
            j++;
        } else if (j > hi) {
            a[k] = buffer[i];
            i++;
        } else if (buffer[j] < buffer[i]) {
            a[k] = buffer[j];
            j++;
        } else {
            a[k] = buffer[i];
            i++;
        }
    }
} 
}
