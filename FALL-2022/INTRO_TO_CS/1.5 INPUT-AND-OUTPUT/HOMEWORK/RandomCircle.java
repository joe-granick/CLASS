public class RandomCircle
{
    public static void main(String[] args)
    {
        int        n = Integer.parseInt(args[0]);
        double     p = Double.parseDouble(args[1]);
        int        r =                         1;
        StdDraw.setXscale(-2, 2);
        StdDraw.setYscale(-2, 2);
        StdDraw.setPenRadius(.01);
        for(int i = 0; i <= n; i++)
        {
            double angle =       (i*Math.PI)/(n/2.0);   
            double     y =         r*Math.sin(angle);
            double     x =         r*Math.cos(angle);
                                 StdDraw.point(x, y);
            System.out.println(x + " " + y + " " + " " + angle);
        } 
    }
}