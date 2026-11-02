import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LibrarySaver {

    private final Path path;

    public LibrarySaver(Path path) {
        this.path = path;
    }

    public List<Book> saveBooks(List<Book> books) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book : books) {
                String line = book.getISBN() + ","
                        + book.getTitle() + ","
                        + book.getCreator() + ","
                        + book.getPages();
                writer.write(line);
                writer.newLine();
            }
        }
        return books;
    }

    public List<Member> saveMembers(List<Member> members) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Member member : members) {
                String line = member.getMemberName() + ","
                        + member.getMemberID();
                writer.write(line);
                writer.newLine();
            }
        }
        return members;
    }

    public List<VideoGame> saveVideoGames(List<VideoGame> videoGames) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (VideoGame videoGame : videoGames) {
                String line = videoGame.getEAN() + ","
                        + videoGame.getTitle() + ","
                        + videoGame.getCreator() + ","
                        + videoGame.getPlatform();
                writer.write(line);
                writer.newLine();
            }
        }
        return videoGames;
    }

    public List<Movie> saveMovies(List<Movie> movies) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Movie movie : movies) {
                String line = movie.getEAN() + ","
                        + movie.getTitle() + ","
                        + movie.getCreator() + ","
                        + movie.getDirector() + ","
                        + movie.getLengthMin();
                writer.write(line);
                writer.newLine();
            }
        }
        return movies;
    }
}
