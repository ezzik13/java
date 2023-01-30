import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import org.json.simple.parser.ParseException;

public class HW2_3 {
    public static void main(String[] args) {
    try {
        Object ob = new JSONParser().parse(new FileReader("diary.json"));
        
        JSONArray SumDiary = (JSONArray) ob;

        

        for (var el : SumDiary){
            JSONObject jo =(JSONObject) el;
            String name = String.valueOf(jo.get("фамилия"));
            String ass = String.valueOf(jo.get("оценка"));
            String subj = String.valueOf(jo.get("предмет"));
            StringBuilder diary = new StringBuilder("студент " + name + " получил " + ass + " по предмету "+ subj);
            System.out.println(diary); 
            // System.out.println(el + " ");
        }

    }
    catch(IOException s){ System.out.println(s.getMessage());}
    catch(ParseException d) {System.out.println(d.getMessage());}
    finally{
            System.out.println("Complete");
        }

}
}
