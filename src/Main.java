import java.util.List;

void main() throws IOException {

    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    Path pathBooks = Path.of("books.csv");

    BookCsvMapper bookCsvMapper = new BookCsvMapper();

    BookCsvFileHandler bookCsvFileHandler = new BookCsvFileHandler(pathBooks, bookCsvMapper);

    LibrarySaver librarySaverBooks = new LibrarySaver(pathBooks);

    /*
    List<Book> books = new ArrayList<>(List.of(
    new Book("8700398365","Harry Potter og De Vises Sten", "J.K. Rowling", 368),
    new Book("9788763812177","Greven af Monte Cristo", "Alexandre Dumas",840),
    new Book("9788711537015","Dræb ikke en sangfugl","Harper Lee",365),
    new Book("9788702294903","Krig og Fred","Lev Tolstoy",1440),
    new Book("9781451673319","Fahrenheit 451","Ray Bradbury",173),
    new Book("9788711699560","Mus og mænd","John Steinbeck",239),
    new Book("9780007136599","Eventyret om ringen","J.R.R. Tolkien",550),
    new Book("9780007136568","De to tårne","J.R.R. Tolkien",544),
    new Book("9788702134599","Kongen vender tilbage","J.R.R. Tolkien",531),
    new Book("9781612130286","Fifty Shades of Grey","E.L. James",356)));
     */

    //librarySaverVideoGames.saveVideoGames(videogames);

    List<Book> books = bookCsvFileHandler.loadBooks();
    for (Book book : books) {
        library.addResource(book);
    }

    Path pathVideoGames = Path.of("videogames.csv");

    VideoGameCsvMapper videoGameCsvMapper = new VideoGameCsvMapper();

    VideoGameCsvFileHandler videoGameCsvFileHandler = new VideoGameCsvFileHandler(pathVideoGames, videoGameCsvMapper);

    LibrarySaver librarySaverVideoGames = new LibrarySaver(pathVideoGames);

    /*
    List<VideoGame> videoGames = new ArrayList<>(List.of(
     new VideoGame("5023117501876","Transport Tycoon","OpenTTD Team","MS-DOS"),
     new VideoGame("333148000544","Super Mario Bros","Nintendo","NES"),
     new VideoGame("0711719275459","The Last of Us","Naughty Dog","PlayStation 3"),
     new VideoGame("0711719964209","God of War [2018]","Santa Monica Studio","PlayStation 4"),
     new VideoGame("4005209072465","Psychonauts","Double Fine Productions","Original Xbox"),
     new VideoGame("5026555245920","Grand Theft Auto IV","Rockstar Games","Xbox 360"),
     new VideoGame("0045496870041","The Legend of Zelda: Ocarina of Time","Nintendo","Nintendo 64"),
     new VideoGame("0045496390136","Super Smash Bros. Melee","Nintendo","Nintendo GameCube"),
     new VideoGame("0045496730734","Pokemon Red Version","Game Freak","Game Boy"),
     new VideoGame("5026555439817","Grand Theft Auto VI","Rockstar Games","PlayStation 5"),
     new VideoGame("0885370951592","Gears of War: Ultimate Edition","Microsoft Game Studios","Xbox One"),
     new VideoGame("0045496420932","Super Mario Odyssey","Nintendo","Nintendo Switch"),
     new VideoGame("0045496312398","Mario Kart World","Nintendo","Nintendo Switch 2"),
     new VideoGame("5021290037151","Batman: Arkham Asylum","Rocksteady","PC"),
     new VideoGame("5055060974698","Resident Evil 4 [2023]","Capcom","Xbox Series X"),
     new VideoGame("5060004760602","Jet Set Radio","Smilebit","SEGA Dreamcast"),
     new VideoGame("0045496731847","Metroid Fusion","Nintendo","Game Boy Advance")));
 */

    //librarySaverVideoGames.saveVideoGames(videogames);

    List<VideoGame> videoGames = videoGameCsvFileHandler.loadVideoGames();
    for (VideoGame videoGame : videoGames) {
        library.addResource(videoGame);
    }

    Path pathMovies = Path.of("movies.csv");

    MovieCsvMapper movieCsvMapper = new MovieCsvMapper();

    MovieCsvFileHandler movieCsvFileHandler = new MovieCsvFileHandler(pathMovies, movieCsvMapper);

    LibrarySaver librarySaverMovies = new LibrarySaver(pathMovies);

    /*
    List<Movie> movies = new ArrayList<>(List.of(
    new Movie("5060223762043","Pulp Fiction","Miramax","Quentin Tarantino",154),
    new Movie("7332431027756","Saving Private Ryan","Amblin Entertainment","Steven Spielberg",169),
    new Movie("0024543440864","Die Hard","20th Century Fox","John McTiernan",132),
    new Movie("0043396194755","Superbad","Columbia Pictures","Greg Mottola",113),
    new Movie("5712192001721","Super Size Me","Samuel Goldwyn Films","Morgan Spurlock",100),
    new Movie("5708758687584","Idioterne","Zentropa","Lars von Trier",110),
    new Movie("5060116727302","The Raid","Stage 6 Films","Gareth Evans",101),
    new Movie("7333018039568","Resident Evil (2026)","Columbia Pictures","Zach Cregger",95),
    new Movie("5050968003105","Free Solo","Nat-Geo Films","Jimmy Chin & Elizabeth C. Vasarhelyi",100),
    new Movie("7333018028289","Barbie","Warner Bros","Greta Gerwig",114)));
     */

    //librarySaverMovies.saveMovies(movies);

    List<Movie> movies = movieCsvFileHandler.loadMovies();
    for (Movie movie : movies) {
        library.addResource(movie);
    }

    Path pathAudioBooks = Path.of("audiobooks.csv");

    AudioBookCsvMapper audioBookCsvMapper = new AudioBookCsvMapper();

    AudioBookCsvFileHandler audioBookCsvFileHandler = new AudioBookCsvFileHandler(pathAudioBooks, audioBookCsvMapper);

    LibrarySaver librarySaverAudioBooks = new LibrarySaver(pathAudioBooks);

    /*
    List<AudioBook> audioBooks = new ArrayList<>(List.of(
    new AudioBook("9780062477521","Hillbilly Elegy","J.D. Vance","J.D. Vance",409),
    new AudioBook("9780008433840","The Hobbit","J.R.R. Tolkien","J.R.R. Tolkien",625),
    new AudioBook("9781491510704","The Fault in Our Stars","John Green","John Green",434),
    new AudioBook("9781713630296","Project Hail Mary","Andy Weir","Andy Weir",970),
    new AudioBook("9781529962628","Wonder","R.J. Palacio","R.J. Palacio",430),
    new AudioBook("9781442394933","Steve Jobs","Walter Isaacson","Walter Isaacson",1518)));
    */

    //librarySaverAudioBooks.saveAudioBooks(audioBooks);

    List<AudioBook> audioBooks = audioBookCsvFileHandler.loadAudioBooks();
    for (AudioBook audioBook : audioBooks) {
        library.addResource(audioBook);
    }

    Path pathMembers = Path.of("members.csv");

    MemberCsvMapper memberCsvMapper = new MemberCsvMapper();

    MemberCsvFileHandler memberCsvFileHandler = new MemberCsvFileHandler(pathMembers, memberCsvMapper);

    LibrarySaver librarySaverMembers = new LibrarySaver(pathMembers);

    /*
    List<Member> members = new ArrayList<>(List.of(
    new Member("Christoffer Vilstrup",100),
    new Member("Kong Gulerod",239),
    new Member("Jeffrey Epstein", 666),
    new Member("John Doe", 001),
    new Member("Jane Doe", 002)));
     */

    //librarySaverMembers.saveMembers(members);

    List<Member> members = memberCsvFileHandler.loadMembers();
    for (Member member : members) {
        library.addMember(member);
    }

    /*
    library.addMember(member1);
    library.addMember(member2);
    library.addMember(member3);
    library.addMember(member4);
    library.addMember(member5);
     */

     /*
    library.addResource(book1);
    library.addResource(book2);
    library.addResource(book3);
    library.addResource(book4);
    library.addResource(book5);
    library.addResource(book6);
    library.addResource(book7);
    library.addResource(book8);
    library.addResource(book9);
    library.addResource(book10);
      */

     /*
    library.addResource(videogame1);
    library.addResource(videogame2);
    library.addResource(videogame3);
    library.addResource(videogame4);
    library.addResource(videogame5);
    library.addResource(videogame6);
    library.addResource(videogame7);
    library.addResource(videogame8);
    library.addResource(videogame9);
    library.addResource(videogame10);
    library.addResource(videogame11);
    library.addResource(videogame12);
    library.addResource(videogame13);
    library.addResource(videogame14);
    library.addResource(videogame15);
    library.addResource(videogame16);
    library.addResource(videogame17);
      */

    /*
    library.addResource(movie1);
    library.addResource(movie2);
    library.addResource(movie3);
    library.addResource(movie4);
    library.addResource(movie5);
    library.addResource(movie6);
    library.addResource(movie7);
    library.addResource(movie8);
    library.addResource(movie9);
    library.addResource(movie10);
     */

     /*
    library.addResource(audiobook1);
    library.addResource(audiobook2);
    library.addResource(audiobook3);
    library.addResource(audiobook4);
    library.addResource(audiobook5);
    library.addResource(audiobook6);
      */

    consoleUI.run();
}