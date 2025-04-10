package design_patterns.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedColor());
        Shape blueSquare = new Square(100, 100, 10, 10, new BlueColor());
        redCircle.draw();
        blueSquare.draw();
    }
}