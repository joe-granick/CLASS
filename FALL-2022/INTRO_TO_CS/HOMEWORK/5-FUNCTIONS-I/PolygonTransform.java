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


    }
}
