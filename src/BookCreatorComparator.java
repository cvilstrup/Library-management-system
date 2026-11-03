import java.util.Comparator;

public class BookCreatorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getCreator().compareTo(book2.getCreator());
}
