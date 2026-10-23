import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


     class BookTest {

    private Book book;

    @BeforeEach
    void setUpBook(){
        book = new Book("234","Fire and Ice", "George RR Martin", 666);
    }

    @Test
    void getBookTest(){
        assertEquals("234", book.getISBN());
        assertEquals("Fire and Ice", book.getTitle());
        assertEquals("George RR Martin", book.getCreator());
        assertEquals(666, book.getPages());
    }

}
