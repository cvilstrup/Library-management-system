import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class BookTest {
    // public Book(String ISBN, String title, String creator, int pages)

    private Book book;

    @BeforeEach
    void setUpBook(){
        book = new Book("234","Fire and Ice", "George RR Martin", 666);
    }

    @Test
    void testGetISBN(){
        assertEquals("234", book.getISBN());
    }

    @Test
    void testGetTitle() {
        assertEquals("Fire and Ice", book.getTitle());
    }

    @Test
    void testGetCreator() {
        assertEquals("George RR Martin", book.getCreator());
    }

    @Test
    void testGetPages() {
        assertEquals(666, book.getPages());
    }
}
