import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;

public class LibraryCallsCanLoanTest(){
    //Arrange
    DoubleLoanPolicyTest testDouble = new DoubleLoanPolicyTest();
    Library library = new Library(testDouble);

    //Act
    LoanResult result = library.loan();
    boolean canLoanCalled = testDouble.canLoanCalled;

    //Assert
    void assertEquals(LoanResult, Result){};
    void assertTrue(canLoanCalled){}
}
