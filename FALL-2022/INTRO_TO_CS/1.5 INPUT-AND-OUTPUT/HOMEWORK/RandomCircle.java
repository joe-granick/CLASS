public class RandomCircle
{    public static void main(String[] args)
    {
        int        n = Integer.parseInt(args[0]);
        double     p = Double.parseDouble(args[1]);
        int        r =                         1;
        StdDraw.setXscale(-2, 2);
        StdDraw.setYscale(-2, 2);
        StdDraw.setPenRadius(.01);
        double[] xCoords = new double[n];
        double[] yCoords = new double[n];
        double angle;

        for(int i = 0; i < n; i++)
        {
            angle = (i*Math.PI)/(n/2.0);   
            xCoords[i] = r*Math.sin(angle);
            yCoords[i] = r*Math.cos(angle);
            StdDraw.point(xCoords[i], yCoords[i]);
        } 
        StdDraw.setPenRadius(.003);
        StdDraw.setPenColor(StdDraw.GRAY);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
            {
                if(i != j){
                    if(Math.random() < p) StdDraw.line(xCoords[i], yCoords[i], xCoords[j], yCoords[j]);
                }
            }
        }
    }
}