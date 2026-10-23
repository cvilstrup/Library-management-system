import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudiobookTest {

    private AudioBook audioBook;

    @BeforeEach
    void setUp() {
        audioBook = new AudioBook("123", "Mein Kampf", "NS", "Store H", 420);
    }

    @Test
    void testGetters(){
        assertEquals("123", audioBook.getISBN());
        assertEquals("Mein Kampf", audioBook.getTitle());
        assertEquals("NS", audioBook.getCreator());
        assertEquals("Store H", audioBook.getAuthor());
        assertEquals(420, audioBook.getLengthMin());
    }
}
