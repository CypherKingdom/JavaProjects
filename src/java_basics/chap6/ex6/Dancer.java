package java_basics.chap6.ex6;

public class Dancer extends Member {
    public Dancer(String fullName) {
        super(fullName);
    }

    public void dance() {
        System.out.println(this + " is dancing");
    }
}
