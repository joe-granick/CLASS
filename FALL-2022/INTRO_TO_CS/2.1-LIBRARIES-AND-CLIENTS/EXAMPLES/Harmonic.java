public class Harmonic
{
    public static double harmonic(int n)
    {
        double sum = 0.0;
        for(int i = 1; i <= n; i++)
        {
            sum += 1.0/i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double value = harmonic(n);
        System.out.print(value);
    }

}