import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее 
// ариф из этого списка.
public class HW3_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        FillSpisok(numbers);
        printList(numbers);
        int min_a = 0;
        int max_a = 0;
        float sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min_a) 
            min_a = numbers.get(i);
            if (numbers.get(i) > max_a) 
            max_a = numbers.get(i);
            sum = sum + numbers.get(i);            
        }
        float diff_ar = sum / numbers.size();
        System.out.println("минимальное значение:" + min_a + ", \nмаксимальное значение:" + max_a + ", \nсреднеарифметическое:" + diff_ar);
    }
    public static void FillSpisok(List<Integer> list) {
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
        int rand = ran.nextInt(200)-100;
        list.add(rand);
        }
    }
    public static void printList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
