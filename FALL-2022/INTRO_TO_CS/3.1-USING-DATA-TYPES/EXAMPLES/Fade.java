import java.awt.Color;

public class Fade
{
	public static Color blend(Color c1, Color c2, double alpha)
	{
		double r = (1-alpha)*c1.getRed() + alpha*c2.getRed();	
		double g = (1-alpha)*c1.getGreen() + alpha*c2.getGreen();
		double b = (1-alpha)*c1.getBlue() + alpha*c2.getBlue();
		return new Color((int)r, (int)g ,(int)b);
	}

	public static void main(String[] args)
	{
		Picture source = new 	    Picture(args[0]);
		Picture target = new 	    Picture(args[1]);
	 	  int n = Integer.parseInt(args[2]);

		int h = source.height();
		int w = source.width();
		Picture pic = new Picture(w, h);
		for(int i = 0; i <= n; i++)
		{
			for(int col = 0; col < w; col++)
			{
				for(int row = 0; row < h; row++)
				{
					double alpha = (double)i/n;
					Color c1 = source.get(col, row);
					Color c2 = target.get(col, row);
					Color c = blend(c1, c2, alpha);
					pic.set(col, row, c);
					
				}	
				
			}
			pic.show();
		}

	}
}

