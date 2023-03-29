package chapterFifteen.json.serialization;

import chapterFifteen.json.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class CatSerializer {

    public static String convertCatToJson(Cat cat) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }
}