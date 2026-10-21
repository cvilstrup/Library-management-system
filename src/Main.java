void main() {
    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    Book book1 = new Book("8700398365","J.K. Rowling", "Harry Potter og De Vises Sten", 368);
    Book book2 = new Book("9788763812177","Alexandre Dumas", "Greven af Monte Cristo",840);
    Book book3 = new Book("9788711537015","Harper Lee","Dræb ikke en sangfugl",365);
    Book book4 = new Book("9788702294903","Lev Tolstoy","Krig og Fred",1440);
    Book book5 = new Book("9781451673319","Ray Bradbury","Fahrenheit 451",173);
    Book book6 = new Book("9788711699560","John Steinbeck","Mus og mænd",239);
    Book book7 = new Book("9780007136599","J.R.R. Tolkien","Eventyret om ringen",550);
    Book book8 = new Book("9780007136568","J.R.R. Tolkien","De to tårne",544);
    Book book9 = new Book("9788702134599","J.R.R. Tolkien","Kongen vender tilbage",531);

    VideoGame videogame1 = new VideoGame("12345678","Transport Tycoon","OpenTTD Team","MS-DOS");
    VideoGame videogame2 = new VideoGame("12345678","Super Mario Bros","Nintendo","NES");
    VideoGame videogame3 = new VideoGame("12345678","The Last of Us","Naughty Dog","PlayStation 3");
    VideoGame videogame4 = new VideoGame("12345678","God of War [2018]","Santa Monica Studio","PlayStation 4");
    VideoGame videogame5 = new VideoGame("12345678","Psychonauts","Double Fine Productions","Original Xbox");
    VideoGame videogame6 = new VideoGame("12345678","Grand Theft Auto IV","Rockstar Games","Xbox 360");
    VideoGame videogame7 = new VideoGame("12345678","The Legend of Zelda: Ocarina of Time","Nintendo","Nintendo 64");
    VideoGame videogame8 = new VideoGame("12345678","Super Smash Bros. Melee","Nintendo","Nintendo GameCube");
    VideoGame videogame9 = new VideoGame("12345678","Pokemon Red Version","Game Freak","Game Boy");
    VideoGame videogame10 = new VideoGame("12345678","Grand Theft Auto VI","Rockstar Games","PlayStation 5");
    VideoGame videogame11 = new VideoGame("12345678","Gears of War: Ultimate Edition","Microsoft Game Studios","Xbox One");
    VideoGame videogame12 = new VideoGame("12345678","Super Mario Odyssey","Nintendo","Nintendo Switch");
    VideoGame videogame13 = new VideoGame("12345678","Mario Kart World","Nintendo","Nintendo Switch 2");
    VideoGame videogame14 = new VideoGame("12345678","Batman: Arkham Asylum","Rocksteady","PC");
    VideoGame videogame15 = new VideoGame("12345679","Resident Evil 4 [2023]","Capcom","Xbox Series X");
    VideoGame videogame16 = new VideoGame("12345678","Jet Set Radio","Smilebit","SEGA Dreamcast");

    Movie movie1 = new Movie("12345678","Pulp Fiction","Miramax","Quentin Tarantino",154);
    Movie movie2 = new Movie("12345678","Saving Private Ryan","Amblin Entertainment","Steven Spielberg",169);
    Movie movie3 = new Movie("12345678","Die Hard","20th Century Fox","John McTiernan",132);
    Movie movie4 = new Movie("12345678","Superbad","Columbia Pictures","Greg Mottola",113);
    Movie movie5 = new Movie("12345678","Super Size Me","Samuel Goldwyn Films","Morgan Spurlock",100);
    Movie movie6 = new Movie("12345678","Idioterne","Zentropa","Lars von Trier",110);
    Movie movie7 = new Movie("12345678","The Raid","Stage 6 Films","Gareth Evans",101);
    Movie movie8 = new Movie("12345678","Resident Evil (2026)","Columbia Pictures","Zach Cregger",95);
    Movie movie9 = new Movie("12345678","Free Solo","Nat-Geo Films","Jimmy Chin, Elizabeth C. Vasarhelyi",100);
    Movie movie10 = new Movie("12345678","Barbie","Warner Bros","Greta Gerwig",114);

    AudioBook audiobook1 = new AudioBook("12345678","Hillbilly Elegy","?","J.D. Vance",409);
    AudioBook audiobook2 = new AudioBook("12345678","The Hobbit","?","J.R.R. Tolkien",625);
    AudioBook audiobook3 = new AudioBook("12345678","The Fault in Our Stars","?","John Green",434);
    AudioBook audiobook4 = new AudioBook("12345678","Project Hail Mary","?","Andy Weir",970);
    AudioBook audiobook5 = new AudioBook("12345678","Wonder","?","R.J. Palacio",430);
    AudioBook audiobook6 = new AudioBook("12345678","Steve Jobs","?","Walter Isaacson",1518);

    //NES, SNES, Game Boy, Nintendo 64, Nintendo GameCube, Game Boy Advance, Nintendo DS, Nintendo Wii, Nintendo 3DS, Nintendo Wii U, Nintendo Switch, Nintendo Switch 2
    //PlayStation, PlayStation 2, PlayStation 3, PlayStation 4, PlayStation 5, PSP, PS Vita
    //Original Xbox, Xbox 360, Xbox One, Xbox Series X
    //PC, MS-DOS, Linux, MacOS
    //Sega Mega Drive/Genesis, Sega Saturn, Sega Dreamcast

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


    consoleUI.run();
}