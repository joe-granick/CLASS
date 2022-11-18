public class LogFactorial
{
    public static double factorialLn(double n)
    {
        if(n == 1.0) return 0.0;
        return Math.log(n) + factorialLn(n-1.0);
    }
    public static void main(String[] args)
    {
        double n = Double.parseDouble(args[0]);
        System.out.println(Math.log(n));
        StdOut.print(factorialLn(n));
    }
}