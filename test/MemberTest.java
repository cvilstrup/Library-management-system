import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberTest {

    private Member member;

    @BeforeEach
    void setUp() {
        member = new Member("O.B.", 911);
    }

    @Test
    void testGetMemberName(){
        assertEquals("O.B.", member.getMemberName());
    }

    @Test
    void testGetMemberID(){
        assertEquals(911, member.getMemberID());
    }
}
