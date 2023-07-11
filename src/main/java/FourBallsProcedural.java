import processing.core.PApplet;

public class FourBallsProcedural extends PApplet{
    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1 = 0,x2=0,x3=0,x4=0;

    public static void main(String[] args){
        PApplet.main("FourBallsProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x1,HEIGHT/5, DIAMETER, DIAMETER);
        x1++;

        ellipse(x2,2*(HEIGHT/5), DIAMETER, DIAMETER);
        x2=x2+2;

        ellipse(x3,3*(HEIGHT/5), DIAMETER, DIAMETER);
        x3=x3+3;

        ellipse(x4,4*(HEIGHT/5), DIAMETER, DIAMETER);
        x4=x4+4;

    }

    private void printWhite() {
        background(255);
    }
}
