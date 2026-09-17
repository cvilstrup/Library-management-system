import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    public void addMember(Member member) {
        members.add(member);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public Book getBook(int bookID){
        for (Book book : books) {
            if (book.ID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public Member getMember(int memberID){
        for (Member member : members) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null;
    }

    public boolean loanBook(int bookID, int memberID){
        Book book = getBook(bookID);
        Member member = getMember(memberID);
        Loan loan = getLoan(bookID);

        if(book != null && member != null && loan == null){

                Loan newLoan = new Loan(book, member, LocalDate.now());
                loans.add(newLoan);
                return true;

        }
        return false;
    }

    public boolean returnBook(int bookID){
        Loan loan = getLoan(bookID);
        if(loan != null){
            loans.remove(loan);
            return true;
        }
        return false;
    }

    public ArrayList <Book> findLoansByMemberID(int memberID){
        ArrayList<Book> loanedBooks = new ArrayList<>();
        for(Loan loan : loans){
            if(loan.getMember().getMemberID() == memberID){
                loanedBooks.add(loan.getBook());
            }
        }
        return loanedBooks;
    }

    public Loan getLoan(int bookID){
        for (Loan loan : loans) {
            if (loan.getBook().ID() == bookID) {
                return loan;
            }
        }
        return null;
    }

    public void printBooks(){
        IO.println(books);
    }
    public void printMembers(){
        IO.println(members);
    }
}


