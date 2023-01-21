import java.util.Scanner;

// 2. Вывести все простые числа от 1 до 1000 
public class HW2 {
    public static void main(String[] args) {
        String numbers = "2";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, до которого будем искать все простые числа: ");
        int n = scan.nextInt();
        scan.close();
        for (int i = 3; i < n; i++) {
              if (Simple(i) == 0) numbers = numbers + ", " + Integer.toString(i) ;    
        }
        System.out.println(numbers);
    }
    public static int Simple(int a) {
        int j = a - 1;
        int x = 0;
        while (j > 1){
            if (a % j == 0){
                x = 1;
                break;
            } 
            else j--;
        }
    return x;   
    }
}
