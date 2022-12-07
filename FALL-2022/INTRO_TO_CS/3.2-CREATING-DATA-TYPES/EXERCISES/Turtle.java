import java.awt.Color;

public class Turtle
{
	private double x, y;
	private double angle;

	public Turtle(double x0, double y0, double a0)
	{  x = x0; y = y0; angle = a0; }

	public void goForward(double step)
	{
		double oldX = x, oldY = y;
		x += step*Math.cos(Math.toRadians(angle));
		y += step*Math.sin(Math.toRadians(angle));
		StdDraw.line(oldX, oldY, x, y);
	}

	public void turnLeft(double turn)
	{
		angle += turn;
	}
	
	    public void show() {
        StdDraw.show();
    }

    	// pause t milliseconds
    	public void pause(int t) {
        StdDraw.pause(t);
    	}


    	public void setPenColor(Color color) {
        	StdDraw.setPenColor(color);
    	}

    	public void setPenRadius(double radius) {
        	StdDraw.setPenRadius(radius);
    	}

    	public void setCanvasSize(int width, int height) {
        	StdDraw.setCanvasSize(width, height);
    	}

    	public void setXscale(double min, double max) {
        	StdDraw.setXscale(min, max);
    	}

    	public void setYscale(double min, double max) {
        	StdDraw.setYscale(min, max);
    	}
	public static void main(String args[]){
	
		int n = Integer.parseInt(args[0]); 	
		double angle = 360.0/n;
        	double x0 = 0.5;
        	double y0 = 0.0;
        	double step = Math.sqrt(n)/2;
        	
		Turtle turtle = new Turtle(x0, y0, angle/2);
		turtle.setXscale(-5.0, 5.0);
		turtle.setYscale(-5.0, 5.0);
		for(int i = 0; i < n; i++){
			turtle.goForward(step);
        		turtle.turnLeft(angle);
        		turtle.show();

		}
	}
}
