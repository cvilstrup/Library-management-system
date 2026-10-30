import java.time.LocalDate;
import java.util.ArrayList;

public class StandardLoanPolicy implements LoanPolicy{


    @Override
    public boolean canLoan(Resource resource, ArrayList<Loan> memberResourceList) {
        return true;
    }

    @Override
    public LocalDate calculateDueDate(LocalDate borrowedDate, Resource resource) {
        return borrowedDate.plusDays(30);
    }
}
