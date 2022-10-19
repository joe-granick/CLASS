public class Triangle {
    public static void main(String[] args)
    {
        double x = 0.0;
        double y = 0.0;
        double h = Math.sqrt(3)/2.0;


        StdDraw.line(x,y, x+1.0, y);
        StdDraw.line(x, y, (x +0.5), h );
        StdDraw.line((x+1), y, (x+0.5),h);
    }   
}
