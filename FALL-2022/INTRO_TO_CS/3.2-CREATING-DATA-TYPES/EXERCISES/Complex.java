public class Complex
{
	private final double re;
	private final double im;
	
	public Complex(double real, double imag)
	{ 	re = real; im = imag; 	}

	public Complex plus(Complex b)
	{
		double real = this.re + b.re;
		double imag = this.im + b.im;
		return new Complex(real, imag);
	}

	public Complex times(Complex b)
	{
		double real = this.re * b.re - this.im * b.im;
		double imag = this.re * b.im + this.im * b.re;
		return new Complex(real, imag);
	}

	public double abs()
	{	return Math.sqrt(this.re*this.re + this.im*this.im);	}
	
	public double re() { return re; }
	public double im() { return im; }

	public String toString()
	{	return this.re + " + " + this.im + "i";	}

	public static void main(String[] args)
	{
		double real = Double.parseDouble(args[0]);
		double imag = Double.parseDouble(args[1]);

		Complex z0 = new Complex(real, imag);
		Complex z = z0;
		z = z.times(z).plus(z0);
		z = z.times(z).plus(z0);
		String print = z.toString();
		StdOut.println(print);
	}
}
