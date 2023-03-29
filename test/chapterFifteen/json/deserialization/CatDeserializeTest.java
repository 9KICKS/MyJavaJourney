package chapterFifteen.json.deserialization;

import chapterFifteen.json.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializeTest {
    private String catJson;
    private DateTimeFormatter formatter;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);

    @BeforeEach
    void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        catJson = "{\"name\":\"Morenike\",\"age\":20,\"birthday\":" + "\"" + formatter.format(dateOfBirth) + "\"" + "}";
    }

    @Test
    void deserializedJsonToCat() {
        Cat ologbo = CatDeserialize.deserializeJsonToCat(catJson);
        assertNotNull(ologbo);
        assertEquals("Morenike", ologbo.getName());
        assertEquals(formatter.format(dateOfBirth), formatter.format(ologbo.getDateOfBirth()));
    }
}