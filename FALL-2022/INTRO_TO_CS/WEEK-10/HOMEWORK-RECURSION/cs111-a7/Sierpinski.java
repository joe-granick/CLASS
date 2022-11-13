/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

    private static double[] xCoord = new double[3]; 
    private static double[] yCoord = new double[3]; 

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	// WRITE YOUR CODE HERE
        double height = (Math.sqrt(3.0)/2)*length;
        return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double h = height(length);
        xCoord[0] = x - length/2;
        xCoord[1] = x           ;
        xCoord[2] = x + length/2;
        yCoord[0] = y +      h;
        yCoord[1] =          y;
        yCoord[2] = y +      h;
<<<<<<< HEAD
        StdDraw.filledPolygon(xCoord, yCoord);
=======
        StdDraw.filledPolygon(xCoord, yCoord)
>>>>>>> 3105392e045c23c435327c9bb525ad3aec73e2af
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE
        if (n == 0)  return;
        filledTriangle(x, y, length);
        sierpinski(n-1, x-length/2, y, length/2);
        sierpinski(n-1, x, y+height(length), length/2);
        sierpinski(n-1, x+length/2, y, length/2);
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
<<<<<<< HEAD
        public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x= 0.5;
=======
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5;
>>>>>>> 3105392e045c23c435327c9bb525ad3aec73e2af
        double y = 0.0;
        double l = 0.5;
        double h = height(1.0);
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(0, 0, 0.5, h);
        StdDraw.line(1, 0, 0.5, h);
        sierpinski(n, x, y, l);
    }
}
