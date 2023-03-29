package chapterFifteen.json.serialization;

import chapterFifteen.json.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertNotNull;

class CatSerializerTest {
    private Cat cat;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter formatter;

    @BeforeEach
    public void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }

    @Test public void testConvertCatToJson() {
        String catJson = CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"birthday\":" + "\"" + formatter.format(dateOfBirth) + "\"" + "}", catJson);
    }

    @Test public void testConvertCatToJsonIgnoresNullValues() {
        cat.setName(null);
        String catJson = CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"age\":20,\"birthday\":" + "\"" + formatter.format(dateOfBirth) + "\"" + "}", catJson);
    }
}