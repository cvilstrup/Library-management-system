import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VideoGameCsvFileHandler {

    private final Path path;
    private VideoGameCsvMapper mapper;

    public VideoGameCsvFileHandler(Path path, VideoGameCsvMapper mapper) {
        this.path = path;
        this.mapper = mapper;
    }

    public List<VideoGame> loadVideoGames() throws IOException {
        List<VideoGame> videogames = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine()) != null){
                videogames.add(mapper.fromCsv(line));
            }
        }
        return videogames;
    }
}
