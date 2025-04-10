package design_patterns.structural.bridge;

public class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius, Color c) {
        super(c);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        color.applyColor();
        System.out.println("Drawing Circle of radius: " + radius + " and centered at (" + x + ", " + y + ")");
        System.out.println("Circle filled with the color " + color.getColor());
    }
}