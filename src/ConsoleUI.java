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
                case 1 -> borrowResource();
                case 2 -> returnResource();
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

    private void borrowResource() {
        int memberID = Integer.parseInt(IO.readln("Indtast dit lånenummer: "));
        String identifier = IO.readln("Indtast ISBN/EAN: ");

        if (library.getMember(memberID) == null) {
            IO.println("Brugeren eksisterer ikke");
            return;
        }
        if (library.getResource(identifier) == null) {
            IO.println("Materialet eksisterer ikke");
            return;
        }
        if (library.loanResource(identifier, memberID)) {
            IO.println("Lånet blev registreret");
        } else {
            IO.println("Lånet kunne desværre ikke gennemføres");
        }
    }

    private void returnResource() {
        String identifier = IO.readln("Indtast ISBN/EAN: ");

        if (library.getResource(identifier) == null) {
            IO.println("Materialet eksisterer ikke");
            return;
        }

        if (library.returnResource(identifier)) {
            IO.println("Mange tak. Materialet er nu afleveret");
        } else {
            IO.println("Fejl: materialet kan ikke afleveres, da det ikke er udlånt");
        }
    }



    private void showLoans(){
        int memberID = Integer.parseInt(IO.readln("Indtast dit lånenummer: "));
        IO.println();
            IO.println(library.getMember(memberID));
            library.findLoansByMemberID(memberID);
            if(library.findLoansByMemberID(memberID) == null){
                IO.println("Der er ingen lån tilknyttet til denne bruger");
            }else{
                IO.println(library.findLoansByMemberID(memberID));
            }
        }
    }
