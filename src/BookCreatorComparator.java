
import java.util.*;
//
public class BookTitleComparator {
    int compareTo(Book other) {
        return 0;
    }
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());

        List<String> books = List.of(Book);
        books.add(books);
        Collections.sort(books);
//    }
//        ArrayList<Book> books = new ArrayList<Book>();
//        Arrays.sort(book1, new BookTitleComparator);
        return book1.getTitle().compareTo(book2.getTitle());
    }
}