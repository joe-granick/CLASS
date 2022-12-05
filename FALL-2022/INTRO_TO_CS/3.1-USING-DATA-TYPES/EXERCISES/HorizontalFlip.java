import java.awt.Color;
public class HorizontalFlip{
	public static void main(String[] args)
	{
		Picture source = new Picture(args[0]);
		int h = source.height();
		int w = source.width();
		Picture target = new Picture(w,h);

		for(int row = 0; row < h; row++)
			for(int col =0; col < w; col++)
			{
				Color c = source.get(w-col-1, row);
				target.set(col, row, c);
			}
		source.show();
		target.show();

	}

}
