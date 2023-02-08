import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class sem5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String a = scan.nextLine();
        String str = "[a+(d*3)]";
        System.out.println(Skobki(str));
        scan.close();
    }
    private static Boolean Skobki(String str) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
        Stack<Character> curentSkobki = new Stack<>();
        for (int index = 0; index < str.length(); index++) {
            Character a = str.charAt(index);
            if (pairs.containsKey(a)) 
                curentSkobki.push(pairs.get(a));
            else if (pairs.containsValue(a)){
                if (curentSkobki.isEmpty())
                    return false;
                else if (a!=curentSkobki.pop())
                    return false;
            }
        }
        return curentSkobki.isEmpty();
    }
}