/**
 * program
 */
public class program {
    public static void main(String[] args) {
        String s = null;
        short age = 10;
        int salary = 123456;
        System.out.println(salary);
        System.out.println(age);
        System.out.println(s);  // комментарий
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);
        String msg = "Hello world!";
        System.out.println(msg);

    }
}