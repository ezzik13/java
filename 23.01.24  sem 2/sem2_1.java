import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// N=5
// c1=”Oleg”
// c2=”Vasya”
// res = “OlegVasyaOlegVasyaOleg”



/**
 * sem2_1
 */
public class sem2_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int n = scan.nextInt();
        String c1 = "Oleg";
        String c2 = "Vasya";
        String stringNew = "";
        for (int i = 0; i < n; i++) {
            // if (i%2 == 0)
            //     stringNew = stringNew + c1;
            // else stringNew = stringNew + c2;  
            stringNew = (i%2 == 0) ?  stringNew + c1 : stringNew + c2;   
        }
        System.out.println(stringNew);
       scan.close(); 
    }
}