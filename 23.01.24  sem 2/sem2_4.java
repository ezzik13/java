// import java.io.FileWriter;

// // Напишите метод, который составит строку, 
// // состоящую из 100 повторений слова TEST и метод, который запишет эту 
// // строку в простой текстовый файл, обработайте исключения.


// public class sem2_4 {
//     public static void main(String[] args) {
//         int number = 100;
//         String new_s = "test";
//         String my_str = res(number, new_s);
//         FileWriter Save = new FileWriter("save.txt", true);
//         try{}


//     }
//     public static String res(int num, String a) {
//         StringBuilder result = new StringBuilder(a);
//         for (int i = 0; i < num; i++) {
//             result.append(a);
            
            
//         }
//         return result.toString();
        
//     }
// }




import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class sem2_4 {
//    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
//    и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args){
        String TST = "TEST";
        String OutStr = RepeatStr(100, TST);
        System.out.println(OutStr);
 
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
 
            if (file.createNewFile()) {
                System.out.println("file.created");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(OutStr);
                fileWriter.close();
            } else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(OutStr);
                fileWriter.close();
            }
        }
        catch(IOException e){ System.out.println(e.getMessage());}
        finally{
                System.out.println("Complete");
            }
    }
    public static String RepeatStr(int num, String strToAdd){
        StringBuilder StrOut = new StringBuilder(strToAdd);
        for(int i = 0; i < num; i++) {
            StrOut.append(strToAdd);
        }
        return StrOut.toString();
    }
}