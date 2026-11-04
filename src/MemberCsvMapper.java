import java.time.LocalDate;

public class MemberCsvMapper implements CsvMapper<Member> {

    @Override
    public Member fromCsv(String line){
        String[] parts = line.split(",");
        String memberName = parts[0];
        int memberID = Integer.parseInt(parts[1]);
        return new Member(memberName,memberID);
    }

    @Override
    public String toCsv(Member member){
        return member.getMemberName() + "," + member.getMemberID();
    }
}
