import java.time.LocalDate;
import java.util.ArrayList;

public interface LoanPolicy {

    boolean canLoan(Resource resource, ArrayList<Resource> memberResourceList);

    LocalDate calculateDueDate(LocalDate borrowedDate, Resource resource);
}
