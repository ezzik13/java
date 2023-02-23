import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * sem6_1
 */
public class sem6_1 {


public static void main(String[] args) {
        Integer[] newarr = ArrayRandom(1000, 25);
        System.out.println(Arrays.toString(newarr));
        System.out.println(PercentUnique(newarr));
    }
    public static Double PercentUnique(Integer[] array){
        Double percent = 0.0;
        Set<Integer> newSet = new HashSet<Integer>(Arrays.asList(array));
        percent = Double.parseDouble(String.valueOf(newSet.size())) /
                Double.parseDouble(String.valueOf(array.length)) * 100;
        return percent;
    }
    public static Integer[] ArrayRandom(int size, int max){
        Random rand = new Random();
        Integer[] randomArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(max);
        }
        return randomArray;
    }
}
