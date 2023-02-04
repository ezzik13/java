import java.util.LinkedList;
import java.util.Queue;

// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
/**
 * HW4_2
 */
public class HW4_2 {

    public static void main(String[] args) {
        Queue <String> myQueue = new LinkedList <>();
        myQueue.add("zerro");
        myQueue.add("first");
        myQueue.add("second");
        myPrint(myQueue);
        String asd = "third";
        myEnqueue(myQueue, asd);
        myPrint(myQueue);
        myDequeue(myQueue);
        myPrint(myQueue);
        myfirst(myQueue);
        myPrint(myQueue);
    }

    public static void myPrint(Queue abs){
        for (Object item : abs) {
            System.out.print(item + " ");  
        }
        System.out.println();
    }
    public static void myEnqueue(Queue a, String abc){
        a.add(abc); 
    }
    public static void myDequeue(Queue a){
        System.out.println(a.remove());
    }
    public static void myfirst(Queue a){
        System.out.println(a.element());
        }
    
}