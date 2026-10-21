import java.time.LocalDate;

public class Loan {
    private Resource resource;
    private Member borrowedBy;
    private LocalDate borrowedDate;



    public Loan(Resource resource, Member borrowedBy, LocalDate borrowedDate) {
        this.resource = resource;
        this.borrowedBy = borrowedBy;
        this.borrowedDate = borrowedDate;
    }

    public boolean isAvailable() {
        return borrowedBy == null;
    }


    public boolean loanResource(Member member) {
        if (isAvailable()) {
            borrowedBy = member;
            borrowedDate = LocalDate.now();
            return true;
        }
        return false;
    }

    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public Resource getResource(){
        return resource;
    }

    public Member getMember(){
        return borrowedBy;
    }

    public boolean isOverDue(){
        return LocalDate.now().isAfter(getDueDate());
    }

    public String toString(){
        return resource + "" + borrowedBy + "Afleveringsfrist: " + getDueDate() ;
    }
}