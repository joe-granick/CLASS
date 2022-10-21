/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Joseph Granick NET ID: jgranick EMAIL: jgranick@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
    double[] copyArray = new double[array.length];
    for(int i = 0; i < array.length; i++)
        copyArray[i] = array[i];
    return copyArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
    for(int i = 0; i < x.length; i++)
    {
        x[i] = x[i]*alpha;
        y[i] = y[i]*alpha;
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
    for(int i = 0; i < x.length; i++)
    {
        x[i] = x[i]+dx;
        y[i] = y[i]+dy;
    }

    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
    double[] copiedX = new double[x.length];
    double[] copiedY = new double[y.length];
    copiedX = copy(x);
    copiedY = copy(y);
    theta = Math.toRadians(theta);

    for(int i = 0; i < x.length; i++)
    {
        x[i] = copiedX[i]*Math.cos(theta) - copiedY[i]*Math.sin(theta);
        y[i] = copiedY[i]*Math.cos(theta) + copiedX[i]*Math.sin(theta);
    }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    
    // Scales polygon by the factor 2.
        StdDraw.setScale(-5.0, +5.0); 
        double[] x1 = { 0, 1, 1, 0 }; 
        double[] y1 = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x1, y1); 
        scale(x1, y1, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x1, y1);

    // Translates polygon by (2, 1).
        StdDraw.setScale(-5.0, +5.0); 
        double[] x2 = { 0, 1, 1, 0 }; 
        double[] y2 = { 0, 0, 2, 1 }; 
        double dx = 2.0, dy = 1.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x2, y2); 
        translate(x2, y2, dx, dy); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x2, y2);

    // Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double[] x3 = { 0, 1, 1, 0 }; 
        double[] y3 = { 0, 0, 2, 1 }; 
        double theta = 45.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x3, y3); 
        rotate(x3, y3, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x3, y3);

    }
}
