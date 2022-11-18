public class Ex226
{
    public static void ex(int n)
    {
        if(n <= 0) return;
        System.out.println(n);
        ex(n-2);
        ex(n-3);
        System.out.println(n);
    }

    public static void main (String[] args)
    {
        ex(6);
    }

}