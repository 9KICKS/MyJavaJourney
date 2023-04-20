package chapterSixteen.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample2 {
    public static void main(String[] args) {
        Map<String, String[]> nigerianStates = new HashMap<>();
        nigerianStates.put("Ondo", new String[]{"Akure", "Gusau"});
        nigerianStates.put("Sokoto", new String[]{"Sokoto", "Gusau"});
        nigerianStates.put("Zamfara", new String[]{"Gembu", "Jalingo"});
        nigerianStates.put("Ogun", new String[]{"Abeokuta", "Ikeja"});

//        nigerianStates.keySet().forEach(k -> System.out.println(k + Arrays.toString(nigerianStates.get(k)) + "\n"));
//        var set = nigerianStates.entrySet();
//        set.forEach(e-> System.out.println(e.getKey() + " : " + Arrays.toString(e.getValue())));

        nigerianStates.keySet().forEach(key -> Arrays.sort(nigerianStates.get(key)));
        nigerianStates.forEach((key, value)-> System.out.println(key + " : " + Arrays.toString(value)));
    }
}