import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и 
// удаляет её из списка.


public class sem4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = new LinkedList<>();
        while (true) {
            String str = scan.nextLine();
            if (str.equals(" ")) break;
            String[] strArr = str.split("~");
            int number = Integer.parseInt(strArr[1]);
            
            
            if(strArr[0].equals("print"))
            try{
                System.out.println(names.get(number));
                names.remove(number);
            }catch(Exception ex) {System.out.println(ex.getMessage());
            }
            else if (number!= names.size()) {
                System.out.println("Incorrected index should be" + names.size());
                continue;}
            else
            names.add(number, strArr[0]);


        }
        scan.close();
    }
}
