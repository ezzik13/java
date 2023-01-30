import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seminar3 {
    public static List<String> planets = new ArrayList<>();
    public static List<String> AllInfo = new ArrayList<>();
    public static void main(String[] args) {
        /* String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1==s6); shift + alt + a
        System.out.println(s1.equals(s6)); */ 
        /* List <Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int temp = random.nextInt(20);
            list.add(temp);
        }
        for (int el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
        list.sort(Integer::compareTo);
        for (int el : list) {
            System.out.print(el + " ");
        } */
        //FillPlanets();
        FillListInfo();
    }
    public static void FillPlanets(){
        String[] fullPlanets = new String[]{"Earth", "Mars","Mercury","Venus","Uranus","Saturn","Jupiter","Neptun"};
        for(int i=0; i<15;i++){
            planets.add(fullPlanets[(int)(Math.random()*fullPlanets.length)]);
        }
        for (var el : planets) {
            System.out.print(el+" ");
        }
        System.out.println();
        //List<String> names = new ArrayList<>();
        for(int i=0;i<fullPlanets.length;i++){
            String onePlanet = fullPlanets[i];
            int count = 0;
            for(int k=0;k<planets.size();k++){
                if(onePlanet.equals(planets.get(k))){
                    count+=1;
                }
            }
            System.out.println(onePlanet + "\t"+ count);
        }

        // for(int i=0;i<planets.size()-1;i++){
        //     //for(int j=1;j<planets.size();j++){
        //         if(planets.get(i).equals(planets.get(i+1))){
        //             planets.remove(i+1);
        //         }
        //     //}
        // }
//Р±РµСЂРµРј С‚РѕР»СЊРєРѕ СѓРЅРёРєР°Р»СЊРЅС‹Рµ РїР»Р°РЅРµС‚С‹
        List<String> UniquePlanets = new ArrayList<>();
        for(int i=0;i<planets.size();i++){
            if(UniquePlanets.indexOf(planets.get(i))==-1){
                UniquePlanets.add(planets.get(i));
            }
        }    
        
        for (var el : UniquePlanets) {
            System.out.print(el+" ");
        } 
    }
    public static void FillListInfo(){
        String[] fullPlanets = new String[]{"Earth", "Mars","Mercury","Venus","Uranus","Saturn","Jupiter","Neptun"};
        for(int i=0;i<15;i++){
            if(i%2==0)
                AllInfo.add(fullPlanets[(int)(Math.random()*fullPlanets.length)]);
            else
                AllInfo.add(Integer.toString((int)(Math.random()*20)));
        }
        for (var el : AllInfo) {
            System.out.print(el+" ");
        }
        System.out.println();
        //Integer.parseInt(String item);
        List<String> ListWithoutNumbers = new ArrayList<>();
        for(int i=0;i<AllInfo.size();i++){
            try{
                Integer.parseInt(AllInfo.get(i));
            }
            catch(NumberFormatException ex){
                ListWithoutNumbers.add(AllInfo.get(i));
            }
        }
        for (var el : ListWithoutNumbers) {
            System.out.print(el+" ");
        }
    }
}