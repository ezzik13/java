import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sem5_1
 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> names = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер и фамилию: ");
            String[] name = iScanner.nextLine().split(" ");//name[0] - номер. name[1] - фамилия
            names.put(Integer.parseInt(name[0]), name[1]);
        }

        for (Map.Entry<Integer, String> el : names.entrySet()) {
            if (el.getValue().equals("Ivanov"))
                System.out.print(el.getKey()+ ": "+ el.getValue() + "\n");
        }
        iScanner.close();
    }
}