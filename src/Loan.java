import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member borrowedBy;
    private LocalDate borrowedDate;



    public Loan(Book book, Member borrowedBy, LocalDate borrowedDate) {
        this.book = book;
        this.borrowedBy = borrowedBy;
        this.borrowedDate = borrowedDate;
    }

    public boolean isAvailable() {
        return borrowedBy == null;
    }


    public boolean loanBook(Member member) {
        if (isAvailable()) {
            borrowedBy = member;
            borrowedDate = LocalDate.now();
            return true;
        } else {
            return false;
        }
    }

    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public Book getBook(){
        return book;
    }

    public Member getMember(){
        return borrowedBy;
    }

    public boolean isOverDue(){
        return LocalDate.now().isAfter(getDueDate());
    }

    public String toString(){
        return book + "" + borrowedBy + "Afleveringsfrist: " + getDueDate() ;
    }
}