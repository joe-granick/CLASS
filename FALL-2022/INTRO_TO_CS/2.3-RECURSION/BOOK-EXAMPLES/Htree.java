public class Htree {
    public static void draw(int n, double size, double x, double y)
    {
        if (n == 0) return; //base case
        
        //execute drawing
        double x0 = x - size/2, x1 = x + size/2; //x and y as center vals make it easier to 
        double y0 = y - size/2, y1 = y + size/2;
        StdDraw.line  (x0, y, x1, y);   //hline
        StdDraw.line(x0, y0, x0, y1);  // vline-1
        StdDraw.line(x1, y0, x1, y1); //  vline-2

        // induction steps
        draw(n-1, size/2, x0, y0);
        draw(n-1, size/2, x0, y1);
        draw(n-1, size/2, x1, y0);
        draw(n-1, size/2, x1, y1);
        
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);

    }
}
