public class ConsoleUI {
    private Library library;

    public ConsoleUI(Library library) {
        this.library = library;
    }

    public void run() {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Indtast dit valg: "));
            switch (choice) {
                case 1 -> borrowBook();
                case 2 -> returnBook();
                case 3 -> showLoans();
                case 0 -> running = false;
                default -> IO.println("Ugyldigt valg. Prøv igen: ");
            }
        }
    }
    private void showMenu() {
        IO.println();
        IO.println("1. Lån");
        IO.println("2. Aflever");
        IO.println("3. Vis alle lån");
        IO.println("0. Afslut");
        IO.println();
    }

    private void borrowBook() {
        int memberID = Integer.parseInt(IO.readln("Indtast dit lånenummer: "));
        int bookID = Integer.parseInt(IO.readln("Indtast bog id: "));

        Member member = library.getMember(memberID);
        if (member == null) {
            IO.println("Brugeren eksisterer ikke");
        }

        Book book = library.getBook(bookID);
        if(book == null){
            IO.println("Bogen eksisterer ikke");
        }

        boolean loanSuccesful = library.loanBook(bookID, memberID);
        if(loanSuccesful){
            IO.println("Lånet blev registeret");
        }else{
            IO.println("Lånet kunne desværre ikke gennemføres");
        }
    }
    private void returnBook(){
        int bookID = Integer.parseInt(IO.readln("Indtast bog id: "));

        Book book = library.getBook(bookID);
        if(book == null){
            IO.println("Bogen eksisterer ikke");
        }

        boolean returnSuccesful = library.returnBook(bookID);
        if(returnSuccesful){
            IO.println("Mange tak. Bogen er nu afleveret");
        }else{
            IO.println("Fejl: bogen kan ikke afleveres tilbage da den ikke er udlånt");
        }
        }

        private void showLoans(){
            int memberID = Integer.parseInt(IO.readln("Indtast dit lånenummer: "));
            IO.println();
            IO.println(library.getMember(memberID));
            IO.println(library.findLoansByMemberID(memberID));
    }
}
