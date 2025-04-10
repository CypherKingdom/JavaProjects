package design_patterns.structural.bridge;

public class Square extends Shape {
    private double x, y, width, height;

    public Square(double x, double y, double width, double height, Color c) {
        super(c);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        color.applyColor();
        System.out.println("Drawing Square of width: " + width + " and height: " +
                height + " centered at (" + (x + width / 2) + ", " + (y + height / 2) + ")");
        System.out.println("Square filled with the color " + color.getColor());
    }
}
