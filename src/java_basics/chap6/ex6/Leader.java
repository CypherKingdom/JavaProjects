package java_basics.chap6.ex6;

public class Leader extends Member {
    private DanceGroup leaderGroup;

    public Leader(String fullName) {
        super(fullName);
    }

    public boolean hire(String fullName, String role) {
        Member m;
        switch (role.toLowerCase()) {
            case "dancer":
                m = new Dancer(fullName);
                break;
            case "singer":
                m = new Singer(fullName);
                break;
            case "dancersinger":
                m = new DancerSinger(fullName);
                break;
            default:
                System.out.println("Member role does not apply");
                return false;
        }
        this.leaderGroup.members.add(m);
        return true;
    }

    public boolean fire(String fullName) {
        for (Member m : this.leaderGroup.members) {
            if (m.getFullName().equals(fullName)) {
                this.leaderGroup.members.remove(m);
                return true;
            }
        }
        System.out.println("Member cannot be found to be fired....");
        return false;
    }

    public DanceGroup getLeaderGroup() {
        return leaderGroup;
    }

    public void setLeaderGroup(DanceGroup leaderGroup) {
        this.leaderGroup = leaderGroup;
    }
}
