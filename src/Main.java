void main() {
    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    Book book1 = new Book("J.K. Rowling", "Harry Potter og De Vises Sten", "8700398365", 1);
    Book book2 = new Book("Alexandre Dumas", "Greven af Monte Cristo", "9788763812177", 2);
    Book book3 = new Book("Harper Lee","Dræb ikke en sangfugl","9788711537015",3);
    Book book4 = new Book("Lev Tolstoy","Krig og Fred","9788702294903",4);
    Book book5 = new Book("Ray Bradbury","Fahrenheit 451","9781451673319",5);
    Book book6 = new Book("John Steinbeck","Mus og mænd","9788711699560",6);
    Book book7 = new Book("J.R.R. Tolkien","Eventyret om ringen","9780007136599",7);
    Book book8 = new Book("J.R.R. Tolkien","De to tårne","9780007136568",8);
    Book book9 = new Book("J.R.R. Tolkien","Kongen vender tilbage","9788702134599",9);

    Member member1 = new Member("Christoffer Vilstrup",122);
    Member member2 = new Member("Kong Gulerod",239);
    Member member3 = new Member("Jeffrey Epstein", 666);
    Member member4 = new Member("John Doe", 001);
    Member member5 = new Member("Jane Doe", 002);

    library.addMember(member1);
    library.addMember(member2);
    library.addMember(member3);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);
    library.addBook(book6);

    consoleUI.run();
}