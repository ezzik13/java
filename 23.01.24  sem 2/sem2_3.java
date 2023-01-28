import java.util.Scanner;

// Напишите метод, который принимает на вход строку 
// (StringBulder) и определяет является ли строка палиндромом (возвращает boolean значение).
// equals и StringBulder для revers

public class sem2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        StringBuilder my_sb = new StringBuilder(scan.nextLine());
        palindrom(my_sb);
    }
    public static void palindrom(StringBuilder a){
        StringBuilder a_pal = new StringBuilder(a).reverse();
        if (a.toString().equals(a_pal.toString()) == true) System.out.println("введенная строка " + a + " палиндром");
        else System.out.println("введенная строка " + a + " не палиндром");
    }
}
