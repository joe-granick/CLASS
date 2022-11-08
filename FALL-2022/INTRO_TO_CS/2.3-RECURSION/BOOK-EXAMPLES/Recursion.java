public class Recursion {


    /*mystery(a,b) returns a*b
     * trick is to convert to bineyr
     *          8421
     * b = 11 = 1011
     * myster(a,11) returns
     * a + a*2 + a*8
     * = a(1 + 2 + 8)
     * = a *11
     * mystery(3,11) = a*b
     */
    public static int mystery(int a, int b)
    {
        if(b==0) return 0;
        if(b%2==0)  return mystery(2*a, b/2);
        return mystery(2*a, b/2) + a;
    }
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int n =             mystery(a, b);
        System.out.println(n);

    }
    
}
