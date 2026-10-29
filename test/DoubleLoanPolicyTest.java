import java.util.ArrayList;

public class DoubleLoanPolicyTest implements LoanPolicy {
    public boolean canLoanCalled = false;

    @Override
    public boolean canLoan(Resource resource, ArrayList<Resource> memberResourceList){
        canLoanCalled = true;
        return true;
    }
}
