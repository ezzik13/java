import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
// К калькулятору из предыдущего дз добавить логирование.

public class HW2_4 {
    public static void main(String[] args) {
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
        
        while (q == true) {
            
            Scanner scan = new Scanner(System.in);
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

            
        } scan.close();
    }
    
}
}
