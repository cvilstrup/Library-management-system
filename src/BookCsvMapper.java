import java.time.LocalDate;

public class BookCsvMapper {

    public Book fromCsv(String line){
        String[] parts = line.split(",");
        String ISBN = parts[0];
        String title = parts[1];
        String creator = parts[2];
        int pages = Integer.parseInt(parts[3]);

        return new Book(ISBN,title,creator,pages);
    }

    public String toCsv(Book book){
        return book.getISBN() + "," + book.getTitle() + "," + book.getCreator() + "," + book.getPages();
    }
}
