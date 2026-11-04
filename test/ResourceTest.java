import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResourceTest {

    @Test
    void testSortByIdentifier() {
        Resource book = new Book("333", "Bog", "Forfatter", 100);
        Resource movie = new Movie("111", "Film", "Studio", "Instruktør", 90);
        Resource videoGame = new VideoGame("222", "Spil", "Udvikler", "PC");

        List<Resource> resources = new ArrayList<>(List.of(book, movie, videoGame));
        Collections.sort(resources);

        assertEquals(movie, resources.get(0));
        assertEquals(videoGame, resources.get(1));
        assertEquals(book, resources.get(2));
    }
}