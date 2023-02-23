import java.util.Locale;

public class Laptop {
    String name;
    String color;
    Integer cost;
    Integer ram;
    Integer ssd;


    void print() {
        System.out.println(name + ", " + cost + " руб, ОЗУ " + ram + " ГгБ, SSD " + ssd + " ГгБ, цвет " + color);
    }

    Laptop(String n, String col, Integer cos, Integer r, Integer s) {
        name = n;
        color = col;
        cost = cos;
        ram = r;
        ssd = s;


    }
    @Override
    public String toString() {
        return String.format("Ноутбук  %s, стоимость: %d рублей, ОЗУ: %d, объем накопителя: %d, цвет: %s", name, cost, ram, ssd, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass()) return false;
        Laptop compareLaptop = (Laptop) obj; 
        if (this.name.equals(compareLaptop.name) && this.color.equals(compareLaptop.color)){
            if ( this.cost == compareLaptop
.cost &&  this.ssd == compareLaptop
.ssd){
                if (this.ram == compareLaptop
    .ram) return true;
            }
        } 
        return false;
    }

}
