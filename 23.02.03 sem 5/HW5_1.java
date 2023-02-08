import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.
/**
 * HW5_1
 */
public class HW5_1 {
public static void main(String[] args) {
    Map<Integer, String> telBook = new HashMap<>();
    telBook.put(123123, "Ivanov_Ivan");
    telBook.put(122122, "Petrov_Sergey");
    telBook.put(133133, "Petrov_Sergey");
    telBook.put(322322, "Sergey_joob");
    printHash(telBook);
}
public static void printHash(Map<Integer, String> a) {
    int count = 1;
    for (Map.Entry<Integer, String> ei: a.entrySet()) {
        System.out.print(count + ". "  + ei.getValue()+ " тел.: "+ ei.getKey() + "\n"); 
        count ++;
    }
    
}

}