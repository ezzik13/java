import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
// Сравните с предыдущим.
/**
 * sem4_1
 */
public class sem4_1 {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            list1.add(j);
        }
        end = System.nanoTime();
        System.out.println(end - start);
    }
}