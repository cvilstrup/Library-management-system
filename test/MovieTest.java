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
    void testGetters(){
        assertEquals("123", movie.getEAN());
        assertEquals("The Room", movie.getTitle());
        assertEquals("Lol productions", movie.getCreator());
        assertEquals("Tommy Wiseau", movie.getDirector());
        assertEquals(100, movie.getLengthMin());
    }
}
