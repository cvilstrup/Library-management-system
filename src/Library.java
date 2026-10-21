import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Resource> resources = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    public void addMember(Member member) {
        members.add(member);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public Resource getResource(String identifier){
        for (Resource resource : resources) {
            if (resource.getIdentifier().equals(identifier)) {
                return resource;
            }
        }
        return null;
    }

    public Member getMember(int memberID){
        for (Member member : members) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null;
    }

    public boolean loanResource(String identifier, int memberID){
        Resource resource = getResource(identifier);
        Member member = getMember(memberID);
        Loan loan = getLoan(identifier);

        if(resource != null && member != null && loan == null){

                Loan newLoan = new Loan(resource, member, LocalDate.now());
                loans.add(newLoan);
                return true;

        }
        return false;
    }

    public boolean returnResource(String identifier){
        Loan loan = getLoan(identifier);
        if(loan != null){
            loans.remove(loan);
            return true;
        }
        return false;
    }

    public ArrayList <Resource> findLoansByMemberID(int memberID){
        ArrayList<Resource> loanedResources = new ArrayList<>();
        for(Loan loan : loans){
            if(loan.getMember().getMemberID() == memberID){
                loanedResources.add(loan.getResource());
            }
        }
        return loanedResources;
    }

    public Loan getLoan(String identifier){
        for (Loan loan : loans) {
            if (loan.getResource().getIdentifier().equals(identifier)) {
                return loan;
            }
        }
        return null;
    }

    public void printResources(){
        IO.println(resources);
    }
    public void printMembers(){
        IO.println(members);
    }
}


