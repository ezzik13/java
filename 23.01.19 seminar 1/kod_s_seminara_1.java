import java.time.*;
import java.util.Random;
import java.util.Scanner;
/**
 * kod_s_seminara_1
 */
public class kod_s_seminara_1 {

    public static void main(String[] args) {
        // String encoding = System.getProperty("console.encoding","cp866");
        Scanner iScanner = new Scanner(System.in);
        //String name = iScanner.nextLine();
        //System.out.println(now + " " + name);//(int)(2.7f)
        //System.out.printf("%s","Hello world!");
        int[] arr = new int[50];
        // System.out.println("VVedite cifru ");
        // int number1 = iScanner.nextInt();
        // System.out.println("VVedite imya: ");
        FillMas(arr);
        PrintMas(arr);
        FindMaxCount(arr);
        //System.out.println(Print(name));
        iScanner.close();
    }

    public static String Print(String name) {
        LocalTime now = LocalTime.now();
        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
            return "Доброго утра "+ name;
        else if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17,59)))
            return "Доброго дня, "+ name;
        else if (now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59)))
            return "Доброго вечера, "+ name;
        else    
            return "доброй ночи, "+ name;
    }

    public static void FillMas(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = (int)(Math.random()*2);// 0 1 -> 0 2 0,5; 1,6; 0,9
            arr[i] = random.nextInt(9);
        }
    }

    public static void PrintMas(int[] arr) {
        for (var el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void FindMaxCount(int[] arr) {
        int counter = 1;
        int result = 1;
        int val = 2; //РїРѕРёСЃРє СЌС‚РѕРіРѕ С‡РёСЃР»Р°
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] && arr[i] == val){
                counter ++;
                if (counter>result) result = counter;
            }else
                counter = 1;
        }
        System.out.println(result);
    }
}