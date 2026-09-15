import java.util.ArrayList;

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
    public void printBooks(){
        IO.println(books);
    }
    public void printMembers(){
        IO.println(members);
    }
}


