package balls;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball (80, 30);
        System.out.println(b1);
        b1.move(-5, 30);
        System.out.println(b1);
    }

}
