import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sem6_2 {
    public static void main(String[] args) {
        // Integer[] arr = {1, 2, 4, 5, 3, 2, 4, 5, 6, 3};
        // HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        // set1.add(10);
        // set1.remove(5);
        // Iterator<Integer> iterator = set1.iterator();
        // while(iterator.hasNext()){
        //     System.out.print(iterator.next() + " ");
        // }
        // System.out.println();
        // LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        // Iterator<Integer> iterator2 = set2.iterator();
        // while(iterator2.hasNext()){
        //     System.out.print(iterator2.next() + " ");
        // }
        // System.out.println();
        // TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        // Iterator<Integer> iterator3 = set3.iterator();
        // while(iterator3.hasNext()){
        //     System.out.print(iterator3.next() + " ");
        // }

        Cat Barsic = new Cat();
        Barsic.name = "Barsik";
        Barsic.Print();
        Cat Pushok = new Cat("Barsik", "Black");
        Pushok.Print();
        System.out.println(Barsic.equals(Pushok));
    }
}
