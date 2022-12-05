import java.awt.Color;

public class Grayscale{
	public static void main(String[] args){

		Picture picture = new Picture(args[0]);

		for(int i = 0; i < picture.height(); i++){
			for(int j = 0; j < picture.width(); j++){
			Color c = Luminance.toGray(picture.get(i, j));
			picture.set(i,j, c); 

			}

		}

		picture.show();


	}


}
