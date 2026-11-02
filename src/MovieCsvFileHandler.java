import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieCsvFileHandler {

    private final Path path;
    private MovieCsvMapper mapper;

    public MovieCsvFileHandler(Path path, MovieCsvMapper mapper) {
        this.path = path;
        this.mapper = mapper;
    }

    public List<Movie> loadMovies() throws IOException {
        List<Movie> movies = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine()) != null){
                movies.add(mapper.fromCsv(line));
            }
        }
        return movies;
    }
}
