public class AnyRoot {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]); //number to take root of
        int k = Integer.parseInt(args[1]); // power root
        double t = (double)n;
        double ESPSILON = 1e-15; // answer should be withing smal margin of actual
        double numer;
        double denom;
        
        while (Math.abs(t - ((double)n)/t) > ESPSILON*t){
            numer = t;
            for (int i = 0; i < k-1; i++){
                // calculates t raised to power for the numerator in x^k where f(x) = x^k - c
                numer = numer*numer;
            }
                // calculates guess raised to diffential of power for f'(t) = (k)x^(k-1)
                denom = (numer/t); 
                t =  ((double)n/(denom) + ((k-1.0)*t))/((double)k); //t- (numer - n)/((double)k*denom); // t - f(t)/f'(t)(  
                System.out.println("The " + k + " root of " + n + " is " + t);
            }       
            
    }
}
    

