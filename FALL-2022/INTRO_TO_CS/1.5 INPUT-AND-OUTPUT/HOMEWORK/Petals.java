public class Petals {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.setPenRadius(.001);
        
        for(double angle = 0.0; angle < 360.0; angle+=.01) 
        {
            double theta = Math.toRadians(angle);
            double r = Math.sin(n*theta);
            double x = r*Math.cos(theta);
            double y = r*Math.sin(theta);
            StdDraw.point(x, y);
        }
    }
    
}
