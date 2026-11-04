import java.util.Comparator;

public class LoanBorrowedDateComparator implements Comparator<Loan> {

    @Override
    public int compare(Loan l1, Loan l2) {
        return l1.getBorrowedDate().compareTo(l2.getBorrowedDate());
    }
}