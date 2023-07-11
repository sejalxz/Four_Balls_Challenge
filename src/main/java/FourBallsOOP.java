import processing.core.PApplet;

public class FourBallsOOP extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private Ball ball1, ball2, ball3, ball4;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, HEIGHT / 5, 1);
        ball2 = new Ball(0, 2 * (HEIGHT / 5), 2);
        ball3 = new Ball(0, 3 * (HEIGHT / 5), 3);
        ball4 = new Ball(0, 4 * (HEIGHT / 5), 4);
    }

    @Override
    public void draw() {
        ball1.update();
        ball2.update();
        ball3.update();
        ball4.update();
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
    }

    public class Ball {
        private float x;
        private float y;
        private float speed;

        public Ball(float x, float y, float speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        public void update() {
            x += speed;
        }

        public void display() {
            ellipse(x, y, DIAMETER, DIAMETER);
        }
    }
}
