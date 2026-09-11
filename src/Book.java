
public class Book {
    final String author;
    final String title;
    final String ISBN;
    final int ID;

    public Book(String author, String title, String ISBN, int ID){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.ID = ID;
    }

    public String toString(){
                return String.format("""
                             %s: %s; ISBN: %s; (%d);
                             """,
                            author, title, ISBN, ID);
    }
}
