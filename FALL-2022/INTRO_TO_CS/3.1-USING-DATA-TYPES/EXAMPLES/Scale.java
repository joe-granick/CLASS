import java.awt.Color;
public class Scale{
	
	public static void main(String[] args){
		Picture source =  new Picture(args[0]);
		int w = Integer.parseInt(args[1]);
		int h = Integer.parseInt(args[2]);
		Picture target = new Picture(w, h);


		for(int tCol = 0; tCol < w; tCol++){
			for(int tRow = 0; tRow < h; tRow++){
				int sRow = tRow*source.height()/h;
				int sCol = tCol*source.width()/w;
				Color c = source.get(sCol, sRow);
				target.set(tCol, tRow, c);
				
			}

		}
		source.show();
		target.show();

	


	}

}
