package ex4;

public class MovableRectangle implements Movable {
    public MovablePoint topleft = new MovablePoint();
    public MovablePoint bottomRight = new MovablePoint();

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topleft.x = x1;
        this.bottomRight.x = x2;
        this.topleft.y = y1;
        this.bottomRight.y = y2;
        this.topleft.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        this.topleft.y+= this.bottomRight.ySpeed;
        this.bottomRight.y+= this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topleft.y-= this.bottomRight.ySpeed;
        this.bottomRight.y-= this.bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topleft.x-=this.topleft.xSpeed;
        this.bottomRight.x-=this.topleft.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topleft.x+=this.topleft.xSpeed;
        this.bottomRight.x+=this.topleft.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle: x: topleft = " + this.topleft.x + ", buttonRight = " + this.bottomRight.x +
                "; y: topleft = " + this.topleft.y+ ", buttonRight = " + this.bottomRight.y +
                "; xSpeed = "+ this.topleft.xSpeed+", ySpeed = "+ this.bottomRight.ySpeed;
    }
}
