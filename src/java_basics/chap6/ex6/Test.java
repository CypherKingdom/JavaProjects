package java_basics.chap6.ex6;

public class Test {
    public static void main(String[] args) {
        DanceGroup d = new DanceGroup();
        Leader l = new Leader("Tony Tony");
        d.setLeader(l);
        l.setLeaderGroup(d);
        l.hire("Patrick Patrick", "dancer");
        l.hire("Fawzieh Fawzieh", "dancersinger");
        l.hire("Fawze Fawze", "singer");
        System.out.println(d.members);
        l.fire("Fawze Fawze");
        System.out.println(d.members);
    }
}
