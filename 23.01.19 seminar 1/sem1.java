import java.time.LocalTime;
import java.util.Scanner;
/**
 * sem1
 */
public class sem1 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner iscanner = new Scanner(System.in);
        String abc = iscanner.next();
        TimeNow(abc);
        iscanner.close();
}
    public static void TimeNow(String name) {
        String hello = "";
        LocalTime now = LocalTime.now();
        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
            hello = "Доброе утро, " + name;
        else if(now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17,59)))
            hello = "Добрый день, " + name;
        else if(now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59)))
            hello = "Добрый вечер, " + name;
        else if(now.isAfter(LocalTime.of(23,0)) && now.isBefore(LocalTime.of(4,59)))
            hello = "Доброй ночи, " + name;
        System.out.println(hello);
}
}