import java.time.LocalDate;
import java.util.ArrayList;

public class LoanCsvMapper implements CsvMapper<Loan> {

    private ArrayList<Resource> resourceList;
    private ArrayList<Member> memberList;

    public LoanCsvMapper(ArrayList<Resource> resourceList, ArrayList<Member> memberList) {
        this.resourceList = resourceList;
        this.memberList = memberList;
    }

    @Override
    public Loan fromCsv(String line) {
        String[] parts = line.split(",");
        Resource resource = findResource(parts[0]);
        Member borrowedBy = findMember(parts[1]);
        LocalDate borrowedDate = LocalDate.parse(parts[2]);
        LocalDate dueDate = LocalDate.parse(parts[3]);

        return new Loan(resource, borrowedBy, borrowedDate, dueDate);
    }

    @Override
    public String toCsv(Loan loan) {
        return loan.getResource().getIdentifier() + "," + loan.getBorrowedBy().getMemberID() + "," +
                loan.getBorrowedDate() + "," + loan.getDueDate();

    }

    private Resource findResource(String identifier) {
        for (Resource resource : resourceList) {
            if (resource.getIdentifier().equals(identifier)) {
                return resource;
            }
        }
        throw new IllegalArgumentException("Ukendt materiale: " + identifier);
    }

    private Member findMember(String memberID) {
        int id = Integer.parseInt(memberID);
        for (Member member : memberList) {
            if (member.getMemberID() == id) {
                return member;
            }
        }
        throw new IllegalArgumentException("Ukendt member: " + id);
    }

}
