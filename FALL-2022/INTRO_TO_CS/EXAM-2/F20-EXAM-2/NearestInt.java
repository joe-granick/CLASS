public class NearestInt{

    public static int roundInt(double n)
    {
        int factor = 1;
        if (n < 0.0) factor = factor*-1;
        int tens = factor*(int)(n*10);
        if(tens%10 >= 5) return (int)(n + 1.0*factor);
        return (int)n; 

    }

    public static void main (String[] args)
    {
        double n = Double.parseDouble(args[0]);
        StdOut.println(roundInt(n));
    }
}