import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BookCsvFileHandler {

        private final Path path;
        private BookCsvMapper mapper;

        public BookCsvFileHandler(Path path, BookCsvMapper mapper) {
            this.path = path;
            this.mapper = mapper;
        }

        public List<Book> loadBooks() throws IOException{
            List<Book> books = new ArrayList<>();
            try(BufferedReader reader = Files.newBufferedReader(path)){
                String line;
                while ((line = reader.readLine()) != null){
                    books.add(mapper.fromCsv(line));
                }
            }
            return books;
        }
    }
