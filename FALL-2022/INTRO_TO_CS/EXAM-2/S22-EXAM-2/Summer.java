public class Summer{
    public static int hSum(int n)
    {

        if(n==0)            return 0;
        if(n>0) return n + hSum(n-1);
        return n + hSum(n+1);
     
    }

    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(hSum(n));
        //System.out.println(2 +0.5);
    }
}