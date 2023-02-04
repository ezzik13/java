// * В калькулятор добавьте возможность отменить последнюю операцию.
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getLogger(HW3_3.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh = null;
        try {
            fh = new FileHandler("log_calc.txt");
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        boolean q = true;
        System.out.print("Введите версию калькулятора для работы \n1 - калькулятор в одно действие \n2 - продолжать решение с предыдущим результатом\nВерсия - ");
        int calc = scan.nextInt();
        logger.info("пользователь выбрал калькулятор " + calc);
        if (calc == 1){
            while (q == true) {
            
            
                System.out.print("Введите первое число(разделитель дроби - запятая): ");
                Double a = scan.nextDouble();
                System.out.print("Введите второе число(разделитель дроби - запятая): ");
                Double b = scan.nextDouble();
                System.out.print("Введите знак действия: ");
                String znak = scan.next();
                logger.info("пользователь ввел " + a + ", " + b + ", " + znak);
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
                        else  logger.info("Деление на 0 недопустимо!");
                        
                    }
                    
                    default:   logger.info("Вы ввели некорректную команду, попробуйте сначала");
                        continue;
                    } 
                System.out.print("Хотите продолжить?(если да, жми '1', если нет, любую другую цифру или букву)");
                String hoch = scan.next();
                switch(hoch) {
                    case "1":{
                        System.out.println("Погнали!");
                        logger.info("Пользователь ввел 1.");
                        continue;
                    }
                    default:{
                         q = false ;
                         logger.info("Пользователь ввел не 1. Работа калькулятора окончена.");
                    }
    
                
            } 
        }
        }
        else if (calc == 2) {
            System.out.print("Введите первое число(разделитель дроби - запятая): ");
            Double a = scan.nextDouble();
            while (q == true) {  
                
                Double hash = a;              
                System.out.print("Введите второе число(разделитель дроби - запятая): ");
                Double b = scan.nextDouble();
                System.out.print("Введите знак действия: ");
                String znak = scan.next();
                logger.info("пользователь ввел " + a + ", " + b + ", " + znak);
                switch(znak) {
                    case "+": System.out.println(a + " + " + b + " = " + (a + b));
                        a = a + b;
                        break;            
                    case "-": System.out.println(a + " - " + b + " = " + (a - b));
                        a = a -b;
                        break;
                    case "*": System.out.println(a + " * " + b + " = " + (a * b));
                        a = a * b;
                        break;
                    case "/":
                        if (b!=0){
                            System.out.println(a + " / " + b + " = " + (a / b));
                            a = a / b;
                            break; }
                        else  logger.info("Деление на 0 недопустимо!");

                    default:   logger.info("Вы ввели некорректную команду, попробуйте сначала");
                        continue;
                    } 
                System.out.print("Хотите продолжить действия с результатом:\nДа? жми '1',\nПересчитать последнее действие?\nжми '2', \nзаканчиваем?, любую другую цифру или букву)");
                String hoch = scan.next();
                switch(hoch) {
                    case "1":{
                        System.out.println("Погнали!");
                        logger.info("Пользователь ввел 1.");
                        System.out.println("Результат предыдущего действия = " + a);
                        continue;
                    }
                    case "2":{
                        System.out.println("Погнали!");
                        a = hash;
                        System.out.println("Продолжаем с числом " + a);
                        logger.info("Пользователь ввел 2.");
                        continue;
                    } 
                    default:{
                         q = false ;
                         logger.info("Пользователь ввел не 1. Работа калькулятора окончена.");
                    }
    
                
            } 
        }
        }
        
        scan.close();
}
}