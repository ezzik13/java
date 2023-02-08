import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * sem5_2
 */
public class sem5_2 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String firstWord = scan.nextLine();
        System.out.print("Введите второе слово: ");
        String secondWord = scan.nextLine();
       System.out.println(IsIzomorph(firstWord, secondWord));
       scan.close();
    }
    public static Boolean IsIzomorph(String s1,String s2){
        Map<Character, Character> pairs = new HashMap<>();
        // String s1 = "title";
        // String s2 = "title";
        // s = "paper",  t = "tiqle"
        // key -> value
        // p -> t
        // a -> i
        // p -> q - не изоморф
        // e -> l
        // r -> e
        // addaa  изоморфно eggee? - да
        // addaa  изоморфно egghh? - нет‚
        if (s1.length()!=s2.length()) 
            return false;
        if (s1.equals(s2))
            return true;
        for (int i = 0; i < s1.length(); i++) {
            Character a = s1.charAt(i);//Символ первого слова
            Character b = s2.charAt(i);//Символ второго слова
            // если в map уже есть ключ "a", то тогда значение по ключу а
            //  должно соответствоват "b"
            if (pairs.containsKey(a) && pairs.get(a)!=b)
                return false;
            else
                pairs.put(a, b);
        }
        return true;
    }

}