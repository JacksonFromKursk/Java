package ex4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint();

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed ) {
        this.radius = radius;
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.center.y+= center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y-= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x-= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x+= center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle: " +
                "radius=" + this.radius +
                "; center: x = " + this.center.x +", y = " + this.center.y +
                "; xSpeed = " + this.center.xSpeed + ", ySpeed = " + this.center.ySpeed;
    }
}
