import java.time.LocalDate;
import java.util.ArrayList;

public class StandardLoanPolicy implements LoanPolicy{


    @Override
    public boolean canLoan(String identifier, ArrayList<Loan> loanList) {
        boolean result = true;
        for (var loan : loanList) {
            if (loan.getResource().getIdentifier().equals(identifier)) {
                result = false;
            }
        }
        return result;
    }

    @Override
    public LocalDate calculateDueDate(String identifier, ArrayList<Loan> loanList) {
        Loan loan = null;
        for (var ln : loanList) {
            if (ln.getResource().getIdentifier().equals(identifier)) {
                loan = ln;
            }
        }

        if (loan == null) {
            return null;
        }

        return loan.getBorrowedDate().plusDays(30);
    }
}
