public class Spiral
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double decay = Double.parseDouble(args[1]);
		double angle = 360.0/n;
		double step = Math.sin(Math.toRadians(angle/2.0));
		Turtle turtle = new Turtle(0.0, 0.0, angle);
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		for( int i = 0; i < 10*360.0/angle; i++)
		{	
			step/=decay;
			turtle.goForward(step);
			turtle.turnLeft(angle);

		}





	}
}
