import java.time.LocalDate;
import java.util.ArrayList;

public class BornholmLoanPolicy implements LoanPolicy {
    @Override
    public boolean canLoan(Resource resource, ArrayList<Loan> memberResourceList){
        return true;
    }

    public LocalDate calculateDueDate(LocalDate borrowedDate, Resource resource){
        if(resource instanceof AudioBook){
            return borrowedDate.plusDays(14);
        }else{
            return borrowedDate.plusDays(30);
        }
    }
}
