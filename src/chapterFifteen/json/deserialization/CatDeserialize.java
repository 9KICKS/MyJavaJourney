package chapterFifteen.json.deserialization;

import chapterFifteen.json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserialize {

    public static Cat deserializeJsonToCat(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}