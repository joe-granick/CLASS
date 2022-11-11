public class Sierpinski { 

   // Height of an equilateral triangle whose sides are of the specified length. 
   public static double height(double length) 
   {
      return (Math.sqrt(3.0)/2)*length;
   }

   // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
   // of the specified side length. 
   public static void filledTriangle(double x, double y, double length) 
   {
      
   }

   // Draws a Sierpinski triangle of order n, such that the largest filled 
   // triangle has bottom vertex (x, y) and sides of the specified length. 
   public static void sierpinski(int n, double x, double y, double length)
   {
      //if(n == 0) return;

      //sierpinski(n-1, x/2, y);
      //sierpinski(n-1, x, y);
      //sierpinski(n-1, x/2, y/2);
   } 

   // Takes an integer command-line argument n; 
   // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
   // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
   // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
   public static void main(String[] args) 
}