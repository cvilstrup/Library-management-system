import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvFileHandler<T> {
    private final Path path;
    private final CsvMapper<T> mapper;

    public CsvFileHandler(Path path, CsvMapper<T> mapper) {
        this.path = path;
        this.mapper = mapper;
    }

    public List<T> load() throws IOException {
        List<T> items = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(mapper.fromCsv(line));
            }
        }
        return items;
    }
}

