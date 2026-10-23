import org.junit.jupiter.api.Test;

import static java.time.LocalTime.now;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class LoanTest {

    @Test
    void getResourceLoan() {
        Resource r1 = new Resource("123", "Din mor", "LOL");
        Member m1 = new Member("Din mor", 200);
        LocalDate ld1 = LocalDate.now();
        Loan loan = new Loan(r1, m1, ld1);
        Resource resource = loan.getResource();
        assertEquals(r1, loan.getResource());
    }
}

