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
    void testGetISBN(){
        assertEquals("123", audioBook.getISBN());
    }

    @Test
    void testGetTitle() {
        assertEquals("Mein Kampf", audioBook.getTitle());
    }

    @Test
    void testGetCreator() {
        assertEquals("NS", audioBook.getCreator());
    }

    @Test
    void testGetAuthor() {
        assertEquals("Store H", audioBook.getAuthor());
    }

    @Test
    void testGetLengthMin() {
        assertEquals(420, audioBook.getLengthMin());
    }
}
