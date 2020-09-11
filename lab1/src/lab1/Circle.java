package lab1;

public class Circle {
    private double radius;
    private String color;
        public Circle(String c) {
        radius = 1.0;
        color = c;
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
    return radius;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return  "radius=" + radius + ", color=" + color;
    }
}