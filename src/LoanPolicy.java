import java.time.LocalDate;
import java.util.ArrayList;

public interface LoanPolicy {

    boolean canLoan(String identifier, ArrayList<Loan> loanList);

    LocalDate calculateDueDate(String identifier, ArrayList<Loan> loanList);

}
