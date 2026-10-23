import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Resource> resources = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    // Resources
    public ArrayList<Resource> getResourceList() {
        return resources;
    }

    public Resource getResource(String identifier){
        for (Resource resource : resources) {
            if (resource.getIdentifier().equals(identifier)) {
                return resource;
            }
        }
        return null;
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Members
    public ArrayList<Member> getMemberList() {
        return members;
    }

    public Member getMember(int memberID){
        for (Member member : members) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    // Loans
    public ArrayList<Loan> getLoanList() {
        return loans;
    }

    public Loan getLoan(String identifier){
        for (Loan loan : loans) {
            if (loan.getResource().getIdentifier().equals(identifier)) {
                return loan;
            }
        }
        return null;
    }

    public LoanResult loanResource(int memberID, String identifier) {
        Member member = getMember(memberID);
        if (member == null) {
            return LoanResult.NOT_MEMBER;
        }

        if (getLoan(identifier) != null) {
            return LoanResult.RESOURCE_ALREADY_LOANED;
        }

        Resource resource = getResource(identifier);
        if (resource == null) {
            return LoanResult.NOT_RESOURCE;
        }

        Loan newLoan = new Loan(resource, member, LocalDate.now());
        loans.add(newLoan);
        resources.remove(getResource(identifier));
        return LoanResult.LOANED;
    }

    public boolean returnResource(String identifier){
        Loan loan = getLoan(identifier);
        if (loan != null) {
            loans.remove(loan);
            resources.add(loan.getResource());
            return true;
        }
        return false;
    }

    public ArrayList <Resource> findLoansByMemberID(int memberID){
        ArrayList<Resource> loanedResources = new ArrayList<>();
        for(Loan loan : loans){
            if(loan.getBorrowedBy().getMemberID() == memberID){
                loanedResources.add(loan.getResource());
            }
        }
        return loanedResources;
    }
}


