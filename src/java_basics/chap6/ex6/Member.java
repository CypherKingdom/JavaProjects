package java_basics.chap6.ex6;

public class Member {
    private String fullName;

    public Member(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Member " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        // if(o.getClass().equals(this.getClass()))
        if (o instanceof Member) {
            Member m = (Member) o;
            if (m.fullName.equals(this.fullName)) {
                return true;
            }
        }
        return false;
    }
}
