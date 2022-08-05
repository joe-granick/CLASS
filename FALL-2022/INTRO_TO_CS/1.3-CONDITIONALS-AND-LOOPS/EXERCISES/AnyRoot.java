public class AnyRoot {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]); //number to take root of
        int k = Integer.parseInt(args[1]); // power root
        double EPSILON = 1e-15;
        double t = (double)n;
        double tPowerK = t;
        //double f_prime_t = (tPowerK/t);

        for(int i = 1; i < k; i++) {
            tPowerK = t*tPowerK;
            //System.out.println(tPowerK);
        }
        // |t^k-n| > 0|
        while(Math.abs(tPowerK - n) > EPSILON){
            //System.out.println(tPowerK);
            t = t - (tPowerK - n)/(k*(tPowerK/t)); // t = f(t)/f'(t) where f(x) = x^k - c and f'(x) = (k)x^(k-1)
            tPowerK = t;
            for(int i =1; i < k; i++) {
                tPowerK = t*tPowerK;
            }
        } 
        System.out.println(k + " root of " + n + " = " + t);
    }
}
    

