import java.util.Random;
// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class HW5_3 {
    public static void main(String[] args) {
        int[] array = new int[7];
        fillArrai(array);
        printHeap(array);
        Heapsort(array);
        printHeap(array);
    }
    public static void printHeap(int[] a) { // отображение перамиды в консоль, не корректна разметка для пирамиды более 7 элемнтов
        System.out.println("Массив значений: ");
        int column = 10;;     
        int line = 1;

        for (int index = 0; index < a.length; index++) {
            
            for (int j = 0; j < column/line*2; j++) {
               System.out.print(" "); 
            }
            System.out.print(a[index]);

            if ((Math.log(index+2)/Math.log(2))-(int)(Math.log(index+2)/Math.log(2)) == 0){
                System.out.println();
                line++;
                for (int k = 0; k < column /line-1; k++) {
                    System.out.print(" ");
                }
            }
        }
   System.out.println();
    }
    public static void fillArrai(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(25);
        }
    }
          public static void Heapsort(int[] a) {
            for (int index = 0; index < (Math.log(a.length)/Math.log(2.0))+1; index++) {
                for (int i = a.length-1; i > 0 ; i--) {
                    if(i % 2 == 0){
                        if(a[i]<a[(i-2)/2]){
                            int temp = a[i];
                            a[i] =  a[(i-2)/2];
                            a[(i-2)/2] = temp;
                        }
                    }
                    else{
                        if(a[i]<a[(i-1)/2]){
                            int temp = a[i];
                            a[i] =  a[(i-1)/2];
                            a[(i-1)/2] = temp;
                        }
                    }
                    
                }
          }
        }
        
      
      
    }
