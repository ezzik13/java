import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
// 1) Написать метод, который принимает массив элементов,
//  помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, 
// помещает их в очередь и выводит на консоль содержимое очереди.



/**
 * program2
 */
public class program21 {
    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,3};
        input_instack(arr);
        input_intqueque(arr);
    
    }
    static void input_instack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        // for (int i: stack) {
        //     System.out.println(i);
            
        // }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
       // System.out.println(stack.toString());

    }
    static void input_intqueque(int[] arr){
        //public interface Queue<E>
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            deque.add(arr[i]);
        }
        // for (int i: deque) {
        //     System.out.println(i);
            
        // }
        while (!deque.isEmpty()){
            System.out.println(deque.remove());
        }
        //System.out.println(deque.toString());

    }
    
}
//да, всё нормально, пацаны -> зачем так париться, все супер, жизнь прекрасна!?
//туттутутутутут заварюка кофейку
//кидаем родную землю
// а я говорил, что все ок


