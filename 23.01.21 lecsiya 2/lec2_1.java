/**
 * lec2_1
 */
public class lec2_1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i <1_000_000; i++){
            sb.append("+");
        }
        System.out.println(sb);
    }
// СТРОКИ!!!
// contac(): объединение строк
// valueOf(): Преобразует объект в строковое представление(завязан на toString())
// join(): объедмняет набор строк в  одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(); первый индекс вхождения подстроки
// lastIndexOf(): последний  индекс вхождения подстроки 
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую

// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см. аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// compareTo(): сравнивает 2 строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatvhes(): сравнивает подстроки в строках

// ФАЙЛЫ!!!

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified():возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов или подкаталогов, которые находятся в каталоге
// listFiles():  возвращает массив файлов или подкаталогов, которые находятся в определенном каталоге
// mkdir(): создает новй кытылог
// renameTo(File dest): переименовыввает файл или каталог




}