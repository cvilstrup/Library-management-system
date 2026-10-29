import javax.xml.transform.Result;

public class LibraryCallsCanLoanTest() {
    //Arrange
    DoubleLoanPolicyTest testDouble = new DoubleLoanPolicyTest();
    Library library = new Library( ,testDouble);

    //Act
    LoanResult result = library.loan();
    boolean canLoanCalled = testDouble.canLoanCalled;

    //Assert
    void assertEquals(LoanResult.Success, Result){};
    void assertTrue(canLoanCalled){}
}
