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
    void testGetters(){
        assertEquals("123", videoGame.getEAN());
        assertEquals("Mario", videoGame.getTitle());
        assertEquals("Luigi", videoGame.getCreator());
        assertEquals("Nintendo", videoGame.getPlatform());
    }
}
