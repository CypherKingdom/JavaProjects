package java_basics.chap6.ex6;

public class Singer extends Member {
    public Singer(String fullName) {
        super(fullName);
    }

    public void sing() {
        System.out.println(this + " is dancing");
    }
}
