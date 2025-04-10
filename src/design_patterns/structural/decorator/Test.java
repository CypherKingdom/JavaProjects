package design_patterns.structural.decorator;

public class Test {
    public static void main(String[] args) {
        ChristmasTree tree = new Garland(new BubbleLights(new ChristmasTreeImpl()));
        System.out.println(tree.decorate());
    }
}
