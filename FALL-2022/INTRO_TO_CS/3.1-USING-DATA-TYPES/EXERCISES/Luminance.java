import java.awt.Color;

public class Luminance{

	public static double intensity(Color c)
	{
		int r =   c.getRed();
		int g = c.getGreen();
		int b =  c.getBlue();
		return 0.299*r + 0.587*g  + 0.114*b;
	
	}

	public static Color toGray(Color c)
	{
		int g = (int)Math.round(intensity(c));
		return new Color(g, g, g);

	}

	public static  boolean areCompatible(Color c1, Color c2)

	{

		return Math.round(intensity(c1) - intensity(c2)) >= 128.0;
	}

	public static void main(String[] args){

		int[] a = new int[6];
		for(int i = 0; i < 6; i++)
			a[i] = Integer.parseInt(args[i]);

		Color c1 = new Color(a[0], a[1], a[2]);
		Color c2 = new Color(a[3], a[4], a[5]);
		StdOut.println(areCompatible(c1, c2));
		
		StdDraw.setPenColor(toGray(c1));
		StdDraw.filledSquare(0.25, 0.5, 0.2);
		StdDraw.setPenColor(toGray(c2));
		StdDraw.filledSquare(0.25, 0.5, 0.1);

		StdDraw.filledSquare(0.75, 0.5, 0.2);
		StdDraw.setPenColor(toGray(c1));
		StdDraw.filledSquare(0.75, 0.5, 0.1);

	}

}
