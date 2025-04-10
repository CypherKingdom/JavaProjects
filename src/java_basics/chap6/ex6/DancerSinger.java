package java_basics.chap6.ex6;

public class DancerSinger extends Member {
    public DancerSinger(String fullName) {
        super(fullName);
    }

    public void dance() {
        System.out.println(this + " is dancing");
    }

    public void sing() {
        System.out.println(this + " is singing");
    }
}
