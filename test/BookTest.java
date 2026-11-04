import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


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

    @Test
    void testCompareTwoBooks() {
        Book book1 = new Book("111", "A", "Yeet", 100);
        Book book2 = new Book("222", "B", "Yeet", 100);

        ResourceTitleComparator comparator = new ResourceTitleComparator();

        assertTrue(comparator.compare(book1, book2) < 0);
        assertTrue(comparator.compare(book2, book1) > 0);
    }

    // Malmø: svensk sortering
    @Test
    void testSortSwedish() {
        Book economy = new Book("1", "Ø", "A", 100);
        Book angels = new Book("2", "Ä", "B", 100);
        Book revelation = new Book("3", "Å", "C", 100);

        List<Resource> resources = new ArrayList<>(List.of(economy, angels, revelation));
        resources.sort(new ResourceTitleComparator(Locale.forLanguageTag("sv")));

        assertEquals(revelation, resources.get(0));
        assertEquals(angels, resources.get(1));
        assertEquals(economy, resources.get(2));
    }
}
