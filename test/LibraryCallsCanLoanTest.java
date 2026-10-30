import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryCallsCanLoanTest {
    //Arrange
    DoubleLoanPolicyTest testDouble = new DoubleLoanPolicyTest();
    ArrayList<Resource> resources = new ArrayList<>();
    Library library = new Library(resources);
    Member member = new Member("Per", 150);
    Resource resource = new Resource("12345678", "Bogen om tests", "C. Labo");



    //Act
    @Test
    void testDoublePolicy() {
        library.addMember(member);
        library.addResource(resource);
        LoanResult result = library.loanResource(150, "12345678", testDouble);
        boolean canLoanCalled = testDouble.canLoanCalled;

        //Assert
        assertEquals(LoanResult.LOANED, result);
        assertTrue (canLoanCalled);
    }
}
