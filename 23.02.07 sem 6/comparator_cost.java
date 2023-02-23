import java.util.Comparator; 

public class comparator_cost implements Comparator<Laptop> {
     @Override 
     public int compare(Laptop o1, Laptop o2) { 
        if (o1.cost > o2.cost) { 
            return 1; 
        }
        else if (o1.cost < o2.cost) {
            return -1; 
        } 
        return 0; 
    }
}