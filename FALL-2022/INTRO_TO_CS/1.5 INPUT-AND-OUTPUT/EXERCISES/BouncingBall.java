public class BouncingBall {
    public static void main(String args[]){
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        double rx = .480, ry = .860;
        double vx = .015, vy = .023;
        double radius = .05;
        while (true)
        {
            //update ball position
            if(Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if(Math.abs(ry + vy) + radius > 1.0) vy = - vy;
            rx += vx;
            ry += vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
    
}
