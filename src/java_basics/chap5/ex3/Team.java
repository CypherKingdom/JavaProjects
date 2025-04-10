package java_basics.chap5.ex3;

public class Team extends Players {
    public Player[] team;
    public int cid;

    public Team(int cid) {
        super(11);
        this.cid = cid;
    }

    @Override
    public boolean addPlayer(Player p) {
        if (p.getCid() == this.cid) {
            return super.addPlayer(p);
        }
        return false;
    }
}