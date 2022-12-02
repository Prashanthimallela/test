

import java.util.ArrayList;
import java.util.List;

public class MemberClass {

        int memberId;
        String memberName;
        String memberAddress;

    public int getMemberId() {
        return memberId;
    }

    public MemberClass(int memberId, String memberName, String memberAddress) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }
}
class libraryClass {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        int i;
        arr.add("member");
        System.out.println();

    }
   /* List<String> arr = new ArrayList<String>();
    arr.remove("");*/

}


 /*       Create a Member class with fields like memberId, memberName and Address.
  Another class as Library: library will have collection of Members and features like
   add a member, delete a member, or search for a member based on memberId.
    Lastly create a tester class with main method where you can test below functionalities:
     "Add new member", "Remove a member", "Search for a member"
  */



