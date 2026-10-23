import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class MemberTest {
    public Member member;

    @BeforeEach
        // (String memberName, int memberID)
    void setUpMember(){
        member = new Member("Satan", 666);
    }
    @Test
    void getMemberTest() {
        assertEquals("Satan", member.getMemberName());
        assertEquals("666", member.getMemberID());
    }
}
