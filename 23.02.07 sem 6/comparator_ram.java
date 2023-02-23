import java.util.Comparator; 

public class comparator_ram implements Comparator<Laptop> {
     @Override 
     public int compare(Laptop o1, Laptop o2) { 
        if (o1.ram > o2.ram) { 
            return 1; 
        }
        else if (o1.ram < o2.ram) {
            return -1; 
        } 
        return 0; 
    }
}