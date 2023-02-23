import java.util.Comparator; 

public class comparator_color implements Comparator<Laptop> {
     @Override 
     public int compare(Laptop o1, Laptop o2) { 
        return o1.color.compareTo(o2.color); 
    }
}