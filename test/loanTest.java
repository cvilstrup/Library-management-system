import org.junit.jupiter.api.Test;

import static java.time.LocalTime.now;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class loanTest {

    @Test
    void getResourceLoan() {
        Resource r1 = new Resource("123", "LOL", "Din mor");
        Member m1 = new Member("LOL", 200);
        LocalDate ld1 = LocalDate.now();
        Loan loan = new Loan(r1, m1, ld1);
        Resource resource = loan.getResource();
        assertEquals(r1,loan.getResource());
        }
    }

// Arrange
// Act

// Assert

//    assertTrue
//            assertFalse
//    assertNull
//            assertNotNull