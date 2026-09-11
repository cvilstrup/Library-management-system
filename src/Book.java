import java.time.LocalDate;

public class Book {
    final String author;
    final String title;
    final String ISBN;
    final int ID;
    Member borrowedBy;
    Member returnedBy;
    LocalDate borrowedDate;

    public Book(String author, String title, String ISBN, int ID){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.ID = ID;
        this.borrowedBy = null;
        this.returnedBy = null;
        this.borrowedDate = null;
    }

    public boolean isAvailable(){
        return borrowedBy == null;
    }

    public boolean isRented(){
        return returnedBy == null;
    }

    public boolean loanBook(Member member){
        if(isAvailable()){
            borrowedBy = member;
            borrowedDate = LocalDate.now();
            return true;
        }else{
            return false;
        }
    }

    public boolean returnBook(Member member){
        if(isAvailable()){
            return false;
        }else if(isRented()){
            returnedBy = member;
            borrowedBy = null;
            borrowedDate = null;
            return true;
        }else{
            return false;
        }
    }

    public LocalDate getDueDate(){
        return borrowedDate.plusDays(14);
    }

    public String toString(){
        String status = isAvailable()? "Tilgængelig" : "Udlånt af " + borrowedBy.memberName + ".\nSkal afleveres senest d. " + borrowedDate.plusDays(14);
        return String.format("""
                             %s: %s; ISBN: %s; (%d); Status: %s
                             """,
                            author, title, ISBN, ID, status);
    }
}
