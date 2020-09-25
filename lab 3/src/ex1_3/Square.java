package ex1_3;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        super("RED", false, 1.0, 2.0);
    }

    public Square(double side) {
        super("RED", false, 1.0, 2.0);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: Square, side: " + side +
                ", color: " + color;
    }
}
