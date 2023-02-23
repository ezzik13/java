import java.util.Comparator; 

public class comparator_ssd implements Comparator<Laptop> {
     @Override 
     public int compare(Laptop o1, Laptop o2) { 
        if (o1.ssd > o2.ssd) { 
            return 1; 
        }
        else if (o1.ssd < o2.ssd) {
            return -1; 
        } 
        return 0; 
    }
}