import java.time.LocalDate;
import java.util.ArrayList;

public interface LoanPolicy {
    String canLoan(String identifier, ArrayList<Loan> getloanList, int memberID);
//}

//    boolean canLoan(String identifier, ArrayList<Loan> loanList);
//
//    LocalDate calculateDueDate(String identifier, ArrayList<Loan> loanList);


//    loanPolicy();
//    canLoan(){}
//

    boolean canLoan(String identifier, ArrayList<Loan> loanList);

    LocalDate calculateDueDate(String identifier, ArrayList<Loan> loanList);

}
