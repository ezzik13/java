// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры 
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется 
// восстановить выражение до верного равенства. Предложить хотя бы 
// одно решение или сообщить, что его нет. 

public class HW4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            a = 20 + i;
            b = 10 * i + 5;
            if (a+b == 69) {
                c = i;
                System.out.println("? = " + c );
                System.out.println("2"+ c + " + " + c + "5 = 69");
            }
        }
}
}