public class VideoGameCsvMapper {

    public VideoGame fromCsv(String line){
        String[] parts = line.split(",");
        String EAN = parts[0];
        String title = parts[1];
        String creator = parts[2];
        String platform = parts[3];

        return new VideoGame(EAN,title,creator,platform); //ean, title, creator, platform
    }

    public String toCsv(VideoGame videogame){
        return videogame.getEAN() + "," + videogame.getTitle() + "," + videogame.getCreator() + "," + videogame.getPlatform();
    }
}
