import java.time.LocalDate;

public class MemberCsvMapper {

    public Member fromCsv(String line){
        String[] parts = line.split(",");
        String memberName = parts[0];
        int memberID = Integer.parseInt(parts[1]);
        return new Member(memberName,memberID);
    }

    public String toCsv(Member member){
        return member.getMemberName() + "," + member.getMemberID();
    }
}
