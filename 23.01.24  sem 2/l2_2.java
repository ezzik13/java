import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// Р”Р°РЅР° json СЃС‚СЂРѕРєР° (РјРѕР¶РЅРѕ СЃРѕС…СЂР°РЅРёС‚СЊ РІ С„Р°Р№Р» Рё С‡РёС‚Р°С‚СЊ РёР· С„Р°Р№Р»Р°)
// [{"С„Р°РјРёР»РёСЏ":"РРІР°РЅРѕРІ","РѕС†РµРЅРєР°":"5","РїСЂРµРґРјРµС‚":"РњР°С‚РµРјР°С‚РёРєР°"},
// {"С„Р°РјРёР»РёСЏ":"РџРµС‚СЂРѕРІР°","РѕС†РµРЅРєР°":"4","РїСЂРµРґРјРµС‚":"РРЅС„РѕСЂРјР°С‚РёРєР°"},
// {"С„Р°РјРёР»РёСЏ":"РљСЂР°СЃРЅРѕРІ","РѕС†РµРЅРєР°":"5","РїСЂРµРґРјРµС‚":"Р¤РёР·РёРєР°"}]
// РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ(С‹), РєРѕС‚РѕСЂС‹Р№ СЂР°СЃРїР°СЂСЃРёС‚ json Рё, РёСЃРїРѕР»СЊР·СѓСЏ StringBuilder, 
// СЃРѕР·РґР°СЃС‚ СЃС‚СЂРѕРєРё РІРёРґР°: РЎС‚СѓРґРµРЅС‚ [С„Р°РјРёР»РёСЏ] РїРѕР»СѓС‡РёР» [РѕС†РµРЅРєР°] РїРѕ РїСЂРµРґРјРµС‚Сѓ [РїСЂРµРґРјРµС‚].
// РџСЂРёРјРµСЂ РІС‹РІРѕРґР°:
// РЎС‚СѓРґРµРЅС‚ РРІР°РЅРѕРІ РїРѕР»СѓС‡РёР» 5 РїРѕ РїСЂРµРґРјРµС‚Сѓ РњР°С‚РµРјР°С‚РёРєР°.
// РЎС‚СѓРґРµРЅС‚ РџРµС‚СЂРѕРІР° РїРѕР»СѓС‡РёР» 4 РїРѕ РїСЂРµРґРјРµС‚Сѓ РРЅС„РѕСЂРјР°С‚РёРєР°.
// РЎС‚СѓРґРµРЅС‚ РљСЂР°СЃРЅРѕРІ РїРѕР»СѓС‡РёР» 5 РїРѕ РїСЂРµРґРјРµС‚Сѓ Р¤РёР·РёРєР°.
import org.json.simple.parser.ParseException;

public class l2_2 {
    public static void main(String[] args) {
    try {
        Object ob = new JSONParser().parse(new FileReader("diary.json"));
        
        JSONArray SumDiary = (JSONArray) ob;
        //System.out.println(SumDiary);
        
        

        for (var el : SumDiary){
            JSONObject jo =(JSONObject) el;
            String name = String.valueOf(jo.get("С„Р°РјРёР»РёСЏ"));
            String ass = String.valueOf(jo.get("РѕС†РµРЅРєР°"));
            String subj = String.valueOf(jo.get("РїСЂРµРґРјРµС‚"));
            StringBuilder diary = new StringBuilder("СЃС‚СѓРґРµРЅС‚ " + name + " РїРѕР»СѓС‡РёР» " + ass + " РїРѕ РїСЂРµРґРјРµС‚Сѓ "+ subj);
            System.out.println(diary); 
            //System.out.println(el + " ");
        }

    }
    catch(IOException s){ System.out.println(s.getMessage());}
    catch(ParseException d) {System.out.println(d.getMessage());}
    finally{
            System.out.println("Complete");
        }

}
}