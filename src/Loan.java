import java.time.LocalDate;

public class Loan {
    private final Resource resource;
    private final Member borrowedBy;
    private final LocalDate borrowedDate;
    private final LocalDate dueDate;


    public Loan(Resource resource, Member borrowedBy, LocalDate borrowedDate, LocalDate dueDate) {
        this.resource = resource;
        this.borrowedBy = borrowedBy;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
    }
// switch(Feedback)
//    case Loan -> IO.println()

    public Resource getResource(){
        return resource;
    }

    public Member getBorrowedBy(){
        return borrowedBy;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isOverDue(){
        return LocalDate.now().isAfter(getDueDate());
    }

    public String toString(){
        return resource + ", lånt af: " + borrowedBy + "Lånedato: " + borrowedDate + " | Afleveringsfrist: " + getDueDate() + "\n";
    }
}