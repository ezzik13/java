import java.util.Scanner;

// 3. Реализовать простой калькулятор (пользователь вводит 2 числа и 
// вводит операцию (+ - /  *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
public class HW3 {
    public static void main(String[] args) {
        boolean q = true;
        while (q == true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое число(разделитель дроби - запятая): ");
            Double a = scan.nextDouble();
            System.out.print("Введите второе число(разделитель дроби - запятая): ");
            Double b = scan.nextDouble();
            System.out.print("Введите знак действия: ");
            String znak = scan.next();
            switch(znak) {
                case "+": System.out.println(a + " + " + b + " = " + (a + b));
                   break;
                case "-": System.out.println(a + " - " + b + " = " + (a - b));
                   break;
                case "*": System.out.println(a + " * " + b + " = " + (a * b));
                   break;
                case "/": {
                    if (b!=0){
                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    }
                    else System.out.println("Деление на 0 недопустимо!");
                    
                }
                
                default:  System.out.println("Вы ввели некорректную команду, попробуйте сначала");
                    continue;
                } 
            System.out.print("Хотите продолжить?(если да, жми '1', если нет, любую другую цифру или букву)");
            String hoch = scan.next();
            switch(hoch) {
                case "1":{
                    System.out.println("Погнали!");
                    continue;
                }
                default: q = false ;
            
        }
    }
}
}