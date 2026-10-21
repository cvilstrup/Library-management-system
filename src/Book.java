public class Book extends Resource {

    private final int pages;

    public Book(String ISBN, String title, String creator, int pages) {
        super(ISBN, title, creator);
        this.pages = pages;
    }

    public String getISBN() {
        return getIdentifier();
    }

    public int getPages() {
        return pages;
    }
}