public record Book(String author, String title, String ISBN, int ID) {

    public String toString() {
        return String.format("""
                        %s: %s; ISBN: %s; (%d);
                        """,
                author, title, ISBN, ID);
    }
}