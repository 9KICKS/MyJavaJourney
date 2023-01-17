package chapterEight;

import java.util.Arrays;
import java.util.List;

public enum Zone {
    NORTH_CENTRAL("BENUE", "FCT", "KOGI", "KWARA", "NASARAWA", "NIGER", "PLATEAU"),
    NORTH_EAST("ADAMAWA", "BAUCHI", "BORNO", "GOMBE", "TARABA", "YOBE"),
    NORTH_WEST("KADUNA", "KATSINA", "KANO", "KEBBI", "SOKOTO", "JIGAWA", "ZAMFARA"),
    SOUTH_EAST("ABIA", "ANAMBRA", "EBONYI", "ENUGU", "IMO"),
    SOUTH_SOUTH("AKWA-IBOM", "BAYELSA", "CROSS-RIVER", "DELTA", "EDO", "RIVERS"),
    SOUTH_WEST("EKITI", "LAGOS", "OSUN", "ONDO", "OGUN", "OYO");

    private final List<String > theStates;

     Zone(String... states){
         theStates = Arrays.asList(states);
    }

    public static Zone getPoliticalZone(String state){
         for(Zone zone : values()){
             if(zone.theStates.contains(state.toUpperCase())){
                 return zone;
             }
         }
         return null;
    }
}