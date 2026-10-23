import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideogameTest {

    private VideoGame videoGame;

    @BeforeEach
    void setUp() {
        videoGame = new VideoGame("123", "Mario", "Luigi", "Nintendo");
    }

    @Test
    void testGetEAN(){
        assertEquals("123", videoGame.getEAN());
    }

    @Test
    void testGetTitle() {
        assertEquals("Mario", videoGame.getTitle());
    }

    @Test
    void testGetCreator() {
        assertEquals("Luigi", videoGame.getCreator());
    }

    @Test
    void testGetPlatform() {
        assertEquals("Nintendo", videoGame.getPlatform());
    }
}
