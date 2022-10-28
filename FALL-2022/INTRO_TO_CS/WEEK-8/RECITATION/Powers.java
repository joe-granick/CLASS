public class Powers
{
    public static boolean isPower3(int n)
    {

        if (n <=0) return false;
        while(n >1){
            if(n%3 != 0) return false;
            n = n/3;
        }
        return true;
        /*for(int i = 1; (i*i*i) <= n; i++) if((i*i*i) == n) return true;
        return false;*/
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPower3(n));
    }
}