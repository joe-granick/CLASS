/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
        int n = array.length;
        double[] copy = new double[n];
        for (int i = 0; i < n; i++) copy[i] = array[i];
        return copy;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
    
	// WRITE YOUR CODE HERE
        for (int i = 0; i < x.length; i++) x[i] = x[i]*alpha;
        for (int i = 0; i < y.length; i++) y[i] = y[i]*alpha;
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
        for (int i = 0; i < x.length; i++) x[i] = x[i] + dx;
        for (int i = 0; i < y.length; i++) y[i] = y[i] + dy;
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
    //Need a copy
    double[] xCopy = new double[x.length];
    xCopy = copy(x);
    double[] yCopy = new double[y.length];
    yCopy = copy(y);
    for(int i = 0; i < x.length; i++)
    {
        x[i] = xCopy[i]*Math.cos(theta) - yCopy[i]*Math.sin(theta);
        y[i] = yCopy[i]*Math.cos(theta) + xCopy[i]*Math.sin(theta);
    }

    
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
        // Scales polygon by the factor 2.
        int t = 20000;
        StdDraw.setScale(-5.0, +5.0); 
        double[] x1 = { 0, 1, 1, 0 }; 
        double[] y1 = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x1, y1); 
        scale(x1, y1, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x1, y1);
        StdDraw.pause(t);
        StdDraw.clear();
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
        StdDraw.pause(t);
        StdDraw.clear();
        
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
