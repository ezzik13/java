import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HW6_1 {
    public static void main(String[] args) {
        Laptop HP = new Laptop("HP", "Серый", 45000, 8, 512);
        Laptop Acer = new Laptop("Aser", "Черный", 55000, 16, 512);
        Laptop Apple = new Laptop("Apple", "Серебристый", 75000, 8, 256);
        Laptop MSI = new Laptop("MSI", "Черный", 25000, 4, 128);
        System.out.println("Введите номер интересующего Вас параметра:\n  1 - ОЗУ\n  2 - Объем твердотельного накопителя\n  3 - стоимость\n  4 - цвет");
        Scanner scan = new Scanner(System.in);
        int vib = scan.nextInt();
        var laptops = new HashSet<Laptop>(Arrays.asList(HP, Acer, Apple, MSI));
        viborka(laptops, vib);
        List<Laptop> laptopsSort = new ArrayList<>();
        laptopsSort.add(HP);
        laptopsSort.add(Acer);
        laptopsSort.add(Apple);
        laptopsSort.add(MSI);
        System.out.println("Введите номер параметра сортировки:\n  1 - ОЗУ\n  2 - Объем твердотельного накопителя\n  3 - стоимость\n  4 - цвет");
        Integer numberSort = scan.nextInt();
        if (numberSort == 1) Collections.sort(laptopsSort, new comparator_ram());
        else if (numberSort == 2) Collections.sort(laptopsSort, new comparator_ssd());
        else if (numberSort == 3) Collections.sort(laptopsSort, new comparator_cost());
        else if (numberSort == 4) Collections.sort(laptopsSort, new comparator_color());

        for(Laptop ei : laptopsSort) System.out.println(ei);
        scan.close();
    }
    public static void viborka(HashSet<Laptop> a, int v) {
        if (v==1) for(Laptop ei : a) System.out.println(ei.name + "   " + ei.ram);
        else if (v==2) for(Laptop ei : a) System.out.println(ei.name + "   " + ei.ssd);
        else if (v==3) for(Laptop ei : a) System.out.println(ei.name + "   " + ei.cost);
        else if (v==4) for(Laptop ei : a) System.out.println(ei.name + "   " + ei.color);
    }
    public static void sortByRam(List<Laptop> ls) {
        Collections.sort(ls, new comparator_ram());
}
 
}
