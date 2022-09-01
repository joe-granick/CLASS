public class Scale{
    public static void main(String[] args)
    {
        int n = 50;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for(int i = 0; i < n; i++)
        {
            StdDraw.line(0, n-i, i, 0);
        }

    }
}