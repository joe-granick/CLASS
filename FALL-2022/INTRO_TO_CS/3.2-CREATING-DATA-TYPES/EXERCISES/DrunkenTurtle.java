public class DrunkenTurtle
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		double step = Double.parseDouble(args[2]);
		Turtle[] turtles = new Turtle[n];

		for(int i = 0; i < n; i++){
			double x = StdRandom.uniform(0.0, 1.0);
			double y = StdRandom.uniform(0.0, 1.0);
			turtles[i] = new Turtle(0.0, 0.0, 0.0);
		}
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		for(int i = 0; i < trials; i++)
			for(Turtle t : turtles)
			{
				t.turnLeft(StdRandom.uniform(0.0, 360.0));
				t.goForward(step);
			}
	}
}
