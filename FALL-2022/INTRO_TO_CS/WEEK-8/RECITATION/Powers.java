public class Powers
{
    public static boolean isPower3(int n)
    {
        for(int i = 1; (i*i*i) <= n; i++) if((i*i*i) == n) return true;
        return false;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPower3(n));
    }
}