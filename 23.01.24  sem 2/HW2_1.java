import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации 
// приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}  
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …

public class HW2_1 {
    public static void main(String[] args) throws org.json.simple.parser.ParseException {    
        try {
            Object ob = new JSONParser().parse(new FileReader("adress.json"));
            JSONObject jo =(JSONObject) ob;
            String name = (String) jo.get("name");
            String country = (String) jo.get("country");
            String city = (String) jo.get("city");
            StringBuilder zapros = new StringBuilder("select * from students where 'name' = " + name + " and 'country'= " + country + " and 'city' = "+ city);
            System.out.println(zapros);
        }
        catch(IOException s){ System.out.println(s.getMessage());}
        finally{
                System.out.println("Complete");
            }

            
            
    }
}
