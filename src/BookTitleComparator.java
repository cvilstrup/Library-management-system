import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare (Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }
    // Malmø
    // Collator svCollator = Collator.getInstance(new Locale("sv"));
}
