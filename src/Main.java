void main() {
    LoanPolicy slp = new StandardLoanPolicy();
    Library library = new Library(slp);
    ConsoleUI consoleUI = new ConsoleUI(library);

    Book book1 = new Book("8700398365","Harry Potter og De Vises Sten", "J.K. Rowling", 368);
    Book book2 = new Book("9788763812177","Greven af Monte Cristo", "Alexandre Dumas",840);
    Book book3 = new Book("9788711537015","Dræb ikke en sangfugl","Harper Lee",365);
    Book book4 = new Book("9788702294903","Krig og Fred","Lev Tolstoy",1440);
    Book book5 = new Book("9781451673319","Fahrenheit 451","Ray Bradbury",173);
    Book book6 = new Book("9788711699560","Mus og mænd","John Steinbeck",239);
    Book book7 = new Book("9780007136599","Eventyret om ringen","J.R.R. Tolkien",550);
    Book book8 = new Book("9780007136568","De to tårne","J.R.R. Tolkien",544);
    Book book9 = new Book("9788702134599","Kongen vender tilbage","J.R.R. Tolkien",531);
    Book book10 = new Book("9781612130286","Fifty Shades of Grey","E.L. James",356);

    VideoGame videogame1 = new VideoGame("5023117501876","Transport Tycoon","OpenTTD Team","MS-DOS");
    VideoGame videogame2 = new VideoGame("333148000544","Super Mario Bros","Nintendo","NES");
    VideoGame videogame3 = new VideoGame("0711719275459","The Last of Us","Naughty Dog","PlayStation 3");
    VideoGame videogame4 = new VideoGame("0711719964209","God of War [2018]","Santa Monica Studio","PlayStation 4");
    VideoGame videogame5 = new VideoGame("4005209072465","Psychonauts","Double Fine Productions","Original Xbox");
    VideoGame videogame6 = new VideoGame("5026555245920","Grand Theft Auto IV","Rockstar Games","Xbox 360");
    VideoGame videogame7 = new VideoGame("0045496870041","The Legend of Zelda: Ocarina of Time","Nintendo","Nintendo 64");
    VideoGame videogame8 = new VideoGame("0045496390136","Super Smash Bros. Melee","Nintendo","Nintendo GameCube");
    VideoGame videogame9 = new VideoGame("0045496730734","Pokemon Red Version","Game Freak","Game Boy");
    VideoGame videogame10 = new VideoGame("5026555439817","Grand Theft Auto VI","Rockstar Games","PlayStation 5");
    VideoGame videogame11 = new VideoGame("0885370951592","Gears of War: Ultimate Edition","Microsoft Game Studios","Xbox One");
    VideoGame videogame12 = new VideoGame("0045496420932","Super Mario Odyssey","Nintendo","Nintendo Switch");
    VideoGame videogame13 = new VideoGame("0045496312398","Mario Kart World","Nintendo","Nintendo Switch 2");
    VideoGame videogame14 = new VideoGame("5021290037151","Batman: Arkham Asylum","Rocksteady","PC");
    VideoGame videogame15 = new VideoGame("5055060974698","Resident Evil 4 [2023]","Capcom","Xbox Series X");
    VideoGame videogame16 = new VideoGame("5060004760602","Jet Set Radio","Smilebit","SEGA Dreamcast");
    VideoGame videogame17 = new VideoGame("0045496731847","Metroid Fusion","Nintendo","Game Boy Advance");

    Movie movie1 = new Movie("5060223762043","Pulp Fiction","Miramax","Quentin Tarantino",154);
    Movie movie2 = new Movie("7332431027756","Saving Private Ryan","Amblin Entertainment","Steven Spielberg",169);
    Movie movie3 = new Movie("0024543440864","Die Hard","20th Century Fox","John McTiernan",132);
    Movie movie4 = new Movie("0043396194755","Superbad","Columbia Pictures","Greg Mottola",113);
    Movie movie5 = new Movie("5712192001721","Super Size Me","Samuel Goldwyn Films","Morgan Spurlock",100);
    Movie movie6 = new Movie("5708758687584","Idioterne","Zentropa","Lars von Trier",110);
    Movie movie7 = new Movie("5060116727302","The Raid","Stage 6 Films","Gareth Evans",101);
    Movie movie8 = new Movie("7333018039568","Resident Evil (2026)","Columbia Pictures","Zach Cregger",95);
    Movie movie9 = new Movie("5050968003105","Free Solo","Nat-Geo Films","Jimmy Chin, Elizabeth C. Vasarhelyi",100);
    Movie movie10 = new Movie("7333018028289","Barbie","Warner Bros","Greta Gerwig",114);

    AudioBook audiobook1 = new AudioBook("9780062477521","Hillbilly Elegy","?","J.D. Vance",409);
    AudioBook audiobook2 = new AudioBook("9780008433840","The Hobbit","?","J.R.R. Tolkien",625);
    AudioBook audiobook3 = new AudioBook("9781491510704","The Fault in Our Stars","?","John Green",434);
    AudioBook audiobook4 = new AudioBook("9781713630296","Project Hail Mary","?","Andy Weir",970);
    AudioBook audiobook5 = new AudioBook("9781529962628","Wonder","?","R.J. Palacio",430);
    AudioBook audiobook6 = new AudioBook("9781442394933","Steve Jobs","?","Walter Isaacson",1518);

    Member member1 = new Member("Christoffer Vilstrup",100);
    Member member2 = new Member("Kong Gulerod",239);
    Member member3 = new Member("Jeffrey Epstein", 666);
    Member member4 = new Member("John Doe", 001);
    Member member5 = new Member("Jane Doe", 002);

    library.addMember(member1);
    library.addMember(member2);
    library.addMember(member3);
    library.addMember(member4);
    library.addMember(member5);

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

    library.addResource(audiobook1);
    library.addResource(audiobook2);
    library.addResource(audiobook3);
    library.addResource(audiobook4);
    library.addResource(audiobook5);
    library.addResource(audiobook6);

    consoleUI.run();
}