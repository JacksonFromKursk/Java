package ex4;

public class Test {
    public static void main(String[] args) {
        Movable s1 = new MovablePoint(2, 3, 5, 7);
        for (int i = 0; i < 6; i++) {
            s1.moveDown();
            s1.moveLeft();
        }
        System.out.println(s1);
        Movable s2 = new MovableCircle(2, 3, 5, 7, 3);
        for (int i = 0; i < 6; i++) {
            s2.moveRight();
            s2.moveUp();
        }
        System.out.println(s2);
        Movable s3 = new MovableRectangle(2, 3, 5, 7, 3, 8);
        for (int i = 0; i < 6; i++) {
            s3.moveRight();
            s3.moveDown();
        }
        System.out.println(s3);

    }
}
