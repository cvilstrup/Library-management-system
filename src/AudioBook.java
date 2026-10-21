public class AudioBook extends Resource {

    private final String author;
    private final int lengthMin;

    public AudioBook(String ISBN, String title, String creator, String author, int lengthMin) {
        super(ISBN, title, creator);
        this.author = author;
        this.lengthMin = lengthMin;
    }

    public String getISBN() {
        return getIdentifier();
    }

    public String getAuthor() {
        return author;
    }

    public int getLengthMin() {
        return lengthMin;
    }
}
