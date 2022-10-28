public class Primes {

    public static boolean isPrime(int n)
    {
    
        for(int i = 3; i <= n/2; i+=2)
            if(n%i == 0) return false;
        
        return true;

    }
    

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for(int i = 3; i < n; i++){
            System.out.println(i + " " + isPrime(i));
            //System.out.println(i+1 + " " + false);
        }
    }

}
