import java.util.Objects;

public class Book {
    private final String author;
    private final String title;
    private final String ISBN;
    private final int ID;

    public Book(String author, String title, String ISBN, int ID){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    @Override
    public boolean equals(Object otherObj) {
        if(otherObj == null || getClass() != otherObj.getClass()) return false;
        Book otherBook = (Book) otherObj;
        return Objects.equals(author, otherBook.author) &&
            Objects.equals(title, otherBook.title) &&
                Objects.equals(ISBN, otherBook.ISBN) &&
                Objects.equals(ID, otherBook.ID);
    }

    public String toString(){
                return String.format("""
                             %s: %s; ISBN: %s; (%d);
                             """,
                            author, title, ISBN, ID);
    }
}
