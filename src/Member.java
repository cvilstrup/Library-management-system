import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparator<Member> {
    private final String memberName;
    private final int memberID;

    public Member(String memberName, int memberID) {
        this.memberName = memberName;
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return 0;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        Member otherMember = (Member) otherObj;
        return Objects.equals(memberName, otherMember.memberName) &&
                Objects.equals(memberID, otherMember.memberID);
    }

    public String toString() {
        return String.format("""
                Låner: %s, (låner ID: %d)
                """, memberName, memberID);
    }
}
