import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import java.util.ArrayList;


public abstract class StandartLoanPolicy implements LoanPolicy {

    private StandartLoanPolicy StandartLoanPolicy;
    //
    @BeforeEach
    void canLoan() {
        LocalDate LocalDate = null;
    }
    @BeforeEach
    void calculateDueDate() {}

    @Override
    public LocalDate calculateDueDate(String identifier, ArrayList<Loan> loanList) {
        return null;
    }
}
