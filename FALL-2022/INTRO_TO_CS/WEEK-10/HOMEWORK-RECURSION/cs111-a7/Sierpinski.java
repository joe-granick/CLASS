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
	xCoord[0] = x;
    xCoord[1] = x + length/2;
    xCoord[2] = x + length;

    yCoord[0] = y +      h;
    yCoord[1] =          y;
    yCoord[2] = y +      h;
    StdDraw.filledPolygon(xCoord, yCoord);

    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE
    if (n == 0) return;

    sierpinski(n-1, x-length/4, y, length/2);
    sierpinski(n-1, x+length/2, y+height(length), length/2);
    sierpinski(n-1, x+length/4, y, length/2);

    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE 
    //int n = Integer.parseInt(args[0]);


    double h = height(1.0);
    
    
    StdDraw.line(0, 0, 1, 0);
    StdDraw.line(0, 0, 0.5, h);
    StdDraw.line(1, 0, 0.5, h);
    double xTest = .25;
    double l= 0.5;

    filledTriangle(xTest, 0, l);
    filledTriangle(xTest-l/4, 0, l/2);
    
    /* 
    StdDraw.filledPolygon(x, y);
     
    double[] x1 = new double[3];
    double[] y1 = new double[3];
    y1[0] = y[0]/2;
    y1[1] =   y[1];
    y1[2] = y[2]/2;
    x1[0] = x[0]/2;
    x1[1] = x[1]/2;
    x1[2] = x[2]/2;
    StdDraw.filledPolygon(x1, y1);

    double[] x2 = new double[3];
    double[] y2 = new double[3];
    y2[0] = y[0]+y[0]/2;
    y2[1] = h/2;
    y2[2] = y[2]+y[2]/2;
    x2[0] = x[0]+x[0]/2;
    x2[1] = x[1];
    x2[2] = x[2]-x[0]/2;
    StdDraw.filledPolygon(x2, y2);

    double[] x3 = new double[3];
    double[] y3 = new double[3];
    y3[0] = y[0]/2;
    y3[1] =   y[1];
    y3[2] = y[2]/2;
    
    x3[0] = x[0]*2.5;
    x3[1] = x[1]+x[1]/2;
    x3[2] = x[2]+ x[2]/6;
    StdDraw.filledPolygon(x3, y3);*/
    
    

    }
}
