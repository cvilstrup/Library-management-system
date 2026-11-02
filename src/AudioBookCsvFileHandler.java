import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AudioBookCsvFileHandler {

    private final Path path;
    private AudioBookCsvMapper mapper;

    public AudioBookCsvFileHandler(Path path, AudioBookCsvMapper mapper) {
        this.path = path;
        this.mapper = mapper;
    }

    public List<AudioBook> loadAudioBooks() throws IOException {
        List<AudioBook> audioBooks = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine()) != null){
                audioBooks.add(mapper.fromCsv(line));
            }
        }
        return audioBooks;
    }
}
