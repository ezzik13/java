import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class HW2_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW3_3.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
            logger.info("заполнен " + i + " элемент массива");
        }
        for (var el : arr){
            System.out.print(el + " ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    logger.info("поменяли " + i + " и "+ j + " элементы массива");
                }
            }
        }
        System.out.println();
        for (var el : arr){
            System.out.print(el + " ");
        }
    }
}
