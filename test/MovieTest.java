import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("123", "The Room", "Lol productions", "Tommy Wiseau", 100);
    }

    @Test
    void testGetEAN(){
        assertEquals("123", movie.getEAN());
    }

    @Test
    void testGetTitle() {
        assertEquals("The Room", movie.getTitle());
    }

    @Test
    void testGetCreator() {
        assertEquals("Lol productions", movie.getCreator());
    }

    @Test
    void testGetDirector() {
        assertEquals("Tommy Wiseau", movie.getDirector());
    }

    @Test
    void testGetLengthMin() {
        assertEquals(100, movie.getLengthMin());
    }
}
