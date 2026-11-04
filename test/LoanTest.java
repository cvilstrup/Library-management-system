import org.junit.jupiter.api.Test;

import static java.time.LocalTime.now;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoanTest {

    @Test
    void getResourceLoan() {
        Resource r1 = new Resource("123", "Din mor", "LOL");
        Member m1 = new Member("Din mor", 200);
        LocalDate ld1 = LocalDate.now();
        LoanPolicy standardLoanPolicy = new StandardLoanPolicy();
        Loan loan = new Loan(r1, m1, ld1, ld1);

        Resource resource = loan.getResource();

        assertEquals(r1, loan.getResource());
    }

    @Test
    void testSortByDueDate() {
        Resource r1 = new Resource("1", "Titel 1", "Skaber 1");
        Resource r2 = new Resource("2", "Titel 2", "Skaber 2");
        Member m = new Member("Per", 100);
        LocalDate today = LocalDate.now();

        Loan late = new Loan(r1, m, today, today.plusDays(30));
        Loan early = new Loan(r2, m, today, today.plusDays(10));

        List<Loan> loans = new ArrayList<>(List.of(late, early));
        Collections.sort(loans);

        assertEquals(early, loans.get(0));
        assertEquals(late, loans.get(1));
    }

    @Test
    void testSortByBorrowedDate() {
        Resource r1 = new Resource("1", "Titel 1", "Skaber 1");
        Resource r2 = new Resource("2", "Titel 2", "Skaber 2");
        Member m = new Member("Per", 100);
        LocalDate dueDate = LocalDate.of(2026, 12, 1);

        Loan newer = new Loan(r1, m, LocalDate.of(2026, 11, 1), dueDate);
        Loan older = new Loan(r2, m, LocalDate.of(2026, 10, 1), dueDate);

        List<Loan> loans = new ArrayList<>(List.of(newer, older));
        loans.sort(new LoanBorrowedDateComparator());

        assertEquals(older, loans.get(0));
        assertEquals(newer, loans.get(1));
    }
}

