package design_patterns.structural.bridge;

public class BlueColor implements Color {
    private String fillColor;

    public void applyColor() {
        fillColor = "blue";
    }

    public String getColor() {
        return fillColor;
    }
}