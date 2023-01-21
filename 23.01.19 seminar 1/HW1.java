import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// 1.1. n! (произведение чисел от 1 до n)

public class HW1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scan.nextInt();
        scan.close();
        n = Math.abs(n);
        Factor(n);
        System.out.print("N-ное треугольное число: ");
        System.out.println(treug(n));

    }
    public static void Factor(int a){
        double fact = 1;
        if (a == 0) System.out.println("Факториал 0 = 0");
        else if (a == 1) System.out.println("Факториал 1 = 1");
        else {
            while (a>=2) {
                fact = fact * a;
                a--;
                }
            System.out.print("Факториал числа N: ");
            System.out.println(fact);
            }
        
    }
    public static double treug(int a){
        if (a == 0) return 0;
        else if (a == 1) return 1;
        else return treug(a-1)+a; 

}
}