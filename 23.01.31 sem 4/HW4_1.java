import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
/**
 * HW4_1
 */
public class HW4_1 {

    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
        List <Integer> revList = new LinkedList<>();
        revList = ReversList(list);
        for (int item: revList) {
            System.out.print(item + ", ");
        }
    }
    public static List ReversList(List a){
        List <Integer> res = new LinkedList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            res.add((Integer) a.get(i));

        }
        return res;
    }
}