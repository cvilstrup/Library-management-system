public class VideoGame extends Resource {

    private final String platform;

    public VideoGame(String EAN, String title, String creator, String platform) {
        super(EAN, title, creator);
        this.platform = platform;
    }

    public String getEAN() {
        return getIdentifier();
    }

    public String getPlatform() {
        return platform;
    }
}
