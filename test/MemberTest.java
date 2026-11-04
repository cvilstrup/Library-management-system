import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testCompareTo() {
        Member member1 = new Member("A", 1);
        Member member2 = new Member("B", 2);

        assertTrue(member1.compareTo(member2) < 0);
        assertTrue(member2.compareTo(member1) > 0);
        assertEquals(0, member1.compareTo(new Member("C", 1)));
    }

    @Test
    void testSortByMemberID() {
        Member member1 = new Member("A", 3);
        Member member2 = new Member("B", 1);
        Member member3 = new Member("C", 2);

        List<Member> members = new ArrayList<>(List.of(member1, member2, member3));
        Collections.sort(members);

        assertEquals(member2, members.get(0));
        assertEquals(member3, members.get(1));
        assertEquals(member1, members.get(2));
    }
}
