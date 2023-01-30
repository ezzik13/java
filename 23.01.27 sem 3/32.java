package Folder;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;


public class Sem3 {


 static Logger LOGGER;
 static {
 //Р·Р°Р±РёСЂР°РµРј РєРѕРЅС„РёРіСѓСЂР°С†РёСЋ РёР· log.config
 try(FileInputStream ins = new FileInputStream("log.config")){ 
 //СѓСЃС‚Р°РЅР°РІР»РёРІР°РµРј
 LogManager.getLogManager().readConfiguration(ins);
 //РґР°РµРј РЅР°Р·РІР°РЅРёРµ Р»РѕРіРіРµСЂСѓ
 LOGGER = Logger.getLogger("MyLogger");
 }catch (Exception ignore){
 ignore.printStackTrace();
 }
 }
 
 public static void main(String[] args) {
 //РїСЂРѕРІРµСЂРєР° -> РѕС‚РїСЂР°РІР»СЏРµРј СЃРѕРѕР±С‰РµРЅРёРµ
 LOGGER.log(Level.INFO, "message");
 // String s1 = "hello";
 // String s2 = "hello";
 // String s3 = s1;
 // String s4 = "h" + "e" + "l" + "l" + "o";
 // String s5 = new String("hello");
 // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 // System.out.println(s1==s6);
 // System.out.println(s1.equals(s6));
 // List<Integer> list = new ArrayList<>();
 // FillSpisok(list);
 // OutPutSpisok(list);
 //FillPlanetsList();
 DelListNumber();
 }

 public static void FillSpisok(List<Integer> list) {
 Random random = new Random();
 for (int i = 0; i < 10; i++) {
 int rand = random.nextInt(100);
 list.add(rand);
 }
 }
 public static void OutPutSpisok(List<Integer> list) {
 list.sort(null);
 for (Integer integer : list) {
 System.out.print(integer + " ");
 }
 System.out.println();
 }
 public static void FillPlanetsList() {
 String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran"};
 List<String> planetList = new ArrayList<>();
 for (int i = 0; i < 10; i++) {
 planetList.add(AllPlanets[(int)(Math.random()*AllPlanets.length)]);
 }
 // for (String string : planetList) {
 // System.out.print(string + " ");
 // }
 System.out.println(); 
 planetList.sort(null);
 for (String string : planetList) {
 System.out.print(string + " ");
 }
 System.out.println();
 int count = 1;
 int lengthList = planetList.size();
 for (int i = 1; i < lengthList ; i++) {
 //System.out.println(planetList.get(i));
 if (planetList.get(i)!=planetList.get(i-1)) {
 System.out.println(planetList.get(i-1)+" " +count);
 count = 1;
 }
 else count++;
 }
 System.out.println(planetList.get(lengthList-1) +" "+ count);
 }
 public static void DelListNumber() {
 List<String> list = new ArrayList<>();
 List<String> listWithoutNumber = new ArrayList<>();
 String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran"};
 
 for (int i = 0; i < 10; i++) {
 if (i%2==0)
 list.add(AllPlanets[(int)(Math.random()*AllPlanets.length)]);
 else
 {
 Integer num = new Random().nextInt(10);
 list.add(Integer.toString(num));
 } 
 } 

 for (String string : list) {
 System.out.print(string+ " ");
 } 
 System.out.println();
 for (String string : list) {
 try {
 Integer.parseInt(string);
 }
 catch(Exception ex) {
 listWithoutNumber.add(string);
 }
 }
 for (String string : listWithoutNumber) {
 System.out.print(string + " ");
 }
 }
}