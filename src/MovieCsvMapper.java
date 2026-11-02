public class MovieCsvMapper implements CsvMapper<Movie> {

    @Override
    public Movie fromCsv(String line){
        String[] parts = line.split(",");
        String EAN = parts[0];
        String title = parts[1];
        String creator = parts[2];
        String director = parts[3];
        int lengthMin = Integer.parseInt(parts[4]);

        return new Movie(EAN,title,creator,director,lengthMin); //String EAN, String title, String creator, String director, int lengthMin
    }

    @Override
    public String toCsv(Movie movie){
        return movie.getEAN() + "," + movie.getTitle() + "," + movie.getCreator() + "," + movie.getDirector() + "," + movie.getLengthMin();
    }
}
