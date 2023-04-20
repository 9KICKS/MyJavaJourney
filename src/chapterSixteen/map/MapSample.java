package chapterSixteen.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, String> nigerianStates = new HashMap<>();
        nigerianStates.put("Lagos", "Ikeja");
        nigerianStates.put("Rivers", "Port-Harcourt");
        nigerianStates.put("Osun", "Ife");
        nigerianStates.put("Sokoto", "Sokoto");
        nigerianStates.put("Ogun", "Abeokuta");

        System.out.println("Map -> " + nigerianStates);
    }
}