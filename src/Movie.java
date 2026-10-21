public class Movie extends Resource {

    private final String director;
    private final int lengthMin;

    public Movie(String EAN, String title, String creator, String director, int lengthMin) {
        super(EAN, title, creator);
        this.director = director;
        this.lengthMin = lengthMin;
    }

    public String getEAN() {
        return getIdentifier();
    }

    public String getDirector() {
        return director;
    }

    public int getLengthMin() {
        return lengthMin;
    }
}
