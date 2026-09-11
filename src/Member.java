public class Member {
    final String memberName;
    final int memberID;

    public Member(String memberName, int memberID){
        this.memberName = memberName;
        this.memberID = memberID;
    }

    public String toString(){
        return String.format("""
                             Låner: %s, (låner ID: %d)
                             """, memberName, memberID);
    }
}
