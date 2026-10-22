import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class movieTest {
    @Test
    void testGetEANMovie(){
        Movie movie = new Movie("123","The Room","Lol productions","Tommy Wiseau",100);
        String EAN = movie.getEAN();
        assertEquals("123", EAN);
    }

    @Test
    void testGetTitleMovie(){
        Movie movie = new Movie("123","The Room","Lol productions","Tommy Wiseau",100);
        String title = movie.getTitle();
        assertEquals("The Room",title);
    }

    @Test
    void testGetCreatorMovie(){
        Movie movie = new Movie("123","The Room","Lol productions","Tommy Wiseau",100);
        String creator = movie.getCreator();
        assertEquals("Lol productions",creator);
    }

    @Test
    void testGetDirectorMovie(){
        Movie movie = new Movie("123","The Room","Lol productions","Tommy Wiseau",100);
        String director = movie.getDirector();
        assertEquals("Tommy Wiseau",director);
    }

    @Test
    void testGetLengthMinMovie(){
        Movie movie = new Movie("123","The Room","Lol productions","Tommy Wiseau",100);
        int lengthMin = movie.getLengthMin();
        assertEquals(100,lengthMin);
    }
}
