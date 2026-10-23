import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LibraryTest {

    private Library library;
    private Book book;
    private Member member;

    @BeforeEach
    void setUp() {
        library = new Library();
        book = new Book("123","Harry Potter", "J.K.", 456);
        member = new Member("Idi Amin", 123);

        library.addMember(member);
        library.addResource(book);
    }

    @Test
    void testAddResource() {
        Book book2 = new Book("1234","Harry Potter 2", "J.K.", 4567);
        library.addResource(book2);
        assertEquals(library.getResource("1234"), book2);
    }

    @Test
    void testAddMember() {
        Member member2 = new Member("Idi Amin's far", 1234);
        library.addMember(member2);
        assertEquals(library.getMember(1234), member2);
    }

    @Test
    void testLoanResource_NOT_MEMBER() {
        LoanResult result = library.loanResource(321, "123");
        assertEquals(LoanResult.NOT_MEMBER, result);
    }

    @Test
    void testLoanResource_RESOURCE_ALREADY_LOANED() {
        library.loanResource(123, "123");
        LoanResult result = library.loanResource(123, "123");

        assertEquals(LoanResult.RESOURCE_ALREADY_LOANED, result);
    }

    @Test
    void testLoanResource_NOT_RESOURCE() {
        LoanResult result = library.loanResource(123, "321");
        assertEquals(LoanResult.NOT_RESOURCE, result);
    }

    @Test
    void testLoanResource_LOANED() {
        LoanResult result = library.loanResource(123, "123");

        assertEquals(LoanResult.LOANED, result);
        assertEquals(member, library.getLoan("123").getBorrowedBy());
        assertNull(library.getResource("123"));
    }

    @Test
    void testReturnResource_SUCCES() {
        library.loanResource(123, "123");
        boolean result = library.returnResource("123");

        assertTrue(result);
    }

    @Test
    void testReturnResource_FAIL() {
        library.loanResource(123, "123");
        library.returnResource("123");
        boolean result = library.returnResource("123");

        assertFalse(result);
    }
}