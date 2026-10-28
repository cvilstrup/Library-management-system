import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanPolicyTest {
    private Library library;
    private Member member;
    private LoanPolicy standardLoanPolicy;
    private LoanPolicy aalborgLoanPolicy;

    @BeforeEach
    void setUp() {
        library = new Library();
        member = new Member("Idi Amin", 123);
        standardLoanPolicy = new StandardLoanPolicy();
        aalborgLoanPolicy = new AalborgLoanPolicy();

    }

    // StandardLoanPolicy

    @Test
    void testStandardLoanPolicy() {
        Movie movie1 = new Movie("111", "Movie 1", "Creator 1", "Director 1", 1);
        Movie movie2 = new Movie("222", "Movie 2", "Creator 2", "Director 2", 2);
        Movie movie3 = new Movie("333", "Movie 3", "Creator 3", "Director 3", 3);
        Movie movie4 = new Movie("444", "Movie 4", "Creator 4", "Director 4", 4);

        library.addMember(member);
        library.addResource(movie1);
        library.addResource(movie2);
        library.addResource(movie3);
        library.addResource(movie4);
        library.loanResource(123, "111", standardLoanPolicy);
        library.loanResource(123, "222", standardLoanPolicy);
        library.loanResource(123, "333", standardLoanPolicy);
        library.loanResource(123, "444", standardLoanPolicy);

        int movieCount = library.findLoansByMemberID(member.getMemberID()).size();
        assertEquals(4, movieCount);
    }

    // AalborgLoanPolicy

    @Test
    void testAalborgLoanPolicyCanLoan() {
        Movie movie1 = new Movie("111", "Movie 1", "Creator 1", "Director 1", 1);
        Movie movie2 = new Movie("222", "Movie 2", "Creator 2", "Director 2", 2);
        Movie movie3 = new Movie("333", "Movie 3", "Creator 3", "Director 3", 3);
        Movie movie4 = new Movie("444", "Movie 4", "Creator 4", "Director 4", 4);

        library.addMember(member);
        library.addResource(movie1);
        library.addResource(movie2);
        library.addResource(movie3);
        library.addResource(movie4);
        library.loanResource(123, "111", aalborgLoanPolicy);
        library.loanResource(123, "222", aalborgLoanPolicy);
        library.loanResource(123, "333", aalborgLoanPolicy);
        library.loanResource(123, "444", aalborgLoanPolicy);

        int movieCount = library.findLoansByMemberID(member.getMemberID()).size();
        assertEquals(3, movieCount);
    }

    // BornholmLoanPolicy


}
