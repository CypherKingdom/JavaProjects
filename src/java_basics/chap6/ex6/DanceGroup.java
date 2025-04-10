package java_basics.chap6.ex6;

import java.util.*;

public class DanceGroup {
    private Leader leader;
    public ArrayList<Member> members = new ArrayList<Member>();

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
