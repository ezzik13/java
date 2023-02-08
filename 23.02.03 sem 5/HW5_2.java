import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:Иван Иванов и т.д.
// Написать программу, которая найдет и выведет 
// повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.
/**
 * HW5_2
 */
public class HW5_2 {

    public static void main(String[] args) {
        Map <String, String> spisokWorker= new HashMap<>();
        spisokWorker.put("Petrov", "Ivan");
        spisokWorker.put("Ivanov", "Sergey");
        spisokWorker.put("Sidorov", "Kirill");
        spisokWorker.put("Pupkin", "Sergey");
        spisokWorker.put("Danilov", "Ivan");
        spisokWorker.put("Buzov", "Ivan");
        spisokWorker.put("Shpilkin", "Alex");
        spisokWorker.put("Pilulkin", "Dmitrii");
        spisokWorker.put("Babkin", "Vladimir");
        countName(spisokWorker);


    }
    public static void countName(Map <String, String> s) {
        Map<String, Integer> countNameMap = new HashMap<>();
        for (Map.Entry<String, String> ei: s.entrySet()){
            countNameMap.putIfAbsent(ei.getValue(), 0);
            if( countNameMap.containsKey(ei.getValue()))
                countNameMap.put(ei.getValue(),countNameMap.get(ei.getValue())+1);
         
    }
    Map<String, Integer> sortedMap = countNameMap.entrySet().stream() 
    .sorted(Comparator.comparingInt(e -> -e.getValue())) 
    .collect(Collectors.toMap( 
    Map.Entry::getKey, 
    Map.Entry::getValue, 
    (a, b) -> { throw new AssertionError(); }, 
    LinkedHashMap::new 
    )); 
    for (Map.Entry<String, Integer> el: sortedMap.entrySet()) {
        System.out.print(el.getKey() + " " + el.getValue()+  "\n");
}
}
}