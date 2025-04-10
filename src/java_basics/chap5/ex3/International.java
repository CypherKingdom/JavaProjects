package java_basics.chap5.ex3;

public class International extends Player{
    private String countryname;

    public International(String name, int cid, String countryname) {
        super(name, cid);
        this.countryname = countryname;
    }
    
    @Override
    public String toString() {
        return super.toString() + " from " + this.countryname;
    }
}
