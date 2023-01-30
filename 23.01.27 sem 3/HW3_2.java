import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, 
// удалить из него четные числа
public class HW3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        FillSpisok(numbers);
        printList(numbers);
        System.out.println();
        for (int i = numbers.size()-1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) numbers.remove(i);
        }
        printList(numbers);
    }
    public static void FillSpisok(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        int rand = random.nextInt(100);
        list.add(rand);
        }
    }
    public static void printList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
