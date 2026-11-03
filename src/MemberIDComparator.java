import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberIDComparator implements Comparator<Member> {


    @Override

    public int compare(Member member1, Member member2) {
        ArrayList<Member> members = new ArrayList<>();
        List<Member> MemberID = List.of();
        Collections.sort(MemberID, new MemberIDComparator());
        return 0;
    }
}