import java.awt.Color;
public class GrayHist{

	public static void main(String args[])

	{
		Picture grayscale = new Picture(args[0]);
		int[] intensities = new int[256];
		int max = 0;
		for(int col = 0; col < grayscale.width(); col++)
			for(int row = 0; row < grayscale.height(); row++)
			{
				
				Color c = grayscale.get(col,row);
				//StdOut.println(c.getRed() + " " + c.getGreen() + " " + c.getBlue());
				intensities[c.getRed()]++;
				if (intensities[c.getRed()] > max) max = intensities[c.getRed()];
			}

		for(int i = 0; i < 256; i++)
		{
			StdDraw.setXscale(-256.0, 256.0);
			StdDraw.setYscale(0.0, max*1.5);
			StdDraw.line(i, 0.0,(double)i, (double)intensities[i]);
		}			
	}

}
