public class NestedCircle {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, 2.0*n);
        StdDraw.setYscale(0, 2.0*n);
        for(int i = 0; i < n; i++)
        {
            if(i%2 == 0) StdDraw.setPenColor(StdDraw.RED);
            else         StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(n, n, n-i);
        }
    }
    
}
