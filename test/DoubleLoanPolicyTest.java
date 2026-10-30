import java.time.LocalDate;
import java.util.ArrayList;

public class DoubleLoanPolicyTest implements LoanPolicy {
    public boolean canLoanCalled = false;

    @Override
    public boolean canLoan(Resource resource, ArrayList<Loan> memberResourceList){
        canLoanCalled = true;
        return true;
    }

    @Override
    public LocalDate calculateDueDate(LocalDate borrowedDate, Resource resource) {
        return null;
    }
}
