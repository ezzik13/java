// import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
// import java.util.List;
import java.util.Queue;
// import java.util.Scanner;
import java.util.Stack;

public class Sem4 {
    public static void main(String[] args) {
        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new LinkedList<>();
        // long start = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list1.add(i);
        // }
        // long end = System.nanoTime();
        // System.out.println(end-start);
        // start = System.nanoTime();
        // for (int i = 0; i < 10000; i++) {
        //     list2.add(i);
        // }
        // end = System.nanoTime();
        // System.out.println(end-start);
        // Scanner iScanner = new Scanner(System.in);
        // List<String> names = new ArrayList<>();
        // while(true) {
        //     String str = iScanner.nextLine();
        //     if (str.equals(""))
        //         break;
        //     String[] strArr = str.split("~");//strArr[0]=name(РїСЂРёРІРµС‚), strArr[1]=number(1)
        //     int number = Integer.parseInt(strArr[1]);
        //     if (strArr[0].equals("print"))
        //         try{
        //             System.out.println(names.get(number));
        //             names.remove(number);
        //         }catch(Exception ex){
        //             System.out.println(ex.getMessage());
        //         }
        //     else if (number!=names.size()) {
        //             System.out.println("Incorrect index should be "+names.size());
        //             continue;
        //         }
        //     else 
        //         names.add(number, strArr[0]);

        // }
        // iScanner.close();
        // Scanner iScanner = new Scanner(System.in);
        // Stack<String> stack = new Stack<>();
        // while(true) {
        //          String str = iScanner.nextLine();
        //          if (str.equals(""))
        //              break;
        //         else if (str.equals("print")) {
        //             Collections.reverse(stack);
        //             System.out.println(stack);
        //         }
        //         else if (str.equals("revert"))
        //             stack.pop();
        //         else
        //             stack.push(str);

        // }
        // iScanner.close();
        Integer[] arr = {5,6,7,3,4,6,6};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Collections.addAll(stack, arr);
        Collections.addAll(queue, arr);
        PrintStack(stack);
        System.out.println("\n");
        PrintQueue(queue);

    }
    public static void PrintStack(Stack<Integer> stack) {
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
    }
    public static void PrintQueue(Queue<Integer> queue) {
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
}
}