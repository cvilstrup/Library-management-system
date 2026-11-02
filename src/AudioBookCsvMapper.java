public class AudioBookCsvMapper {

    public AudioBook fromCsv(String line){
        String[] parts = line.split(",");
        String ISBN = parts[0];
        String title = parts[1];
        String creator = parts[2];
        String author = parts[3];
        int lengthMin = Integer.parseInt(parts[4]);

        return new AudioBook(ISBN,title,creator,author,lengthMin); //isbn, title, creator, author, lengthMin
    }

    public String toCsv(AudioBook audioBook){
        return audioBook.getISBN() + "," + audioBook.getTitle() + "," + audioBook.getCreator() + "," + audioBook.getAuthor() + "," + audioBook.getLengthMin();
    }

}
