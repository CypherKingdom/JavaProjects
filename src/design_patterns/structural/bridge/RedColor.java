package design_patterns.structural.bridge;

public class RedColor implements Color {
    private String fillColor;

    public void applyColor() {
        fillColor = "red";
    }

    public String getColor() {
        return fillColor;
    }
}