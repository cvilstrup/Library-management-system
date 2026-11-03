import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberIDComparable implements Comparable<Member> {

    @Override
    public int compare(MemberIDComparable other) {
        String[] book = new String[99];
        List<Member> MemberID = List.of();
        Collections.sort(MemberID, new MemberIDComparator());
        return 0;
    }

    @Override
    public int compareTo(MemberID other) {
        return 0;
    }

    @Override
    public int compareTo(LocalDate other) {
    }
}