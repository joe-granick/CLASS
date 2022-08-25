public class SieveCompare {
    public static void main(String[] args){
        
        int n = 3;
        int primeSteps = 0;
        int sieveSteps = 0;

        do 
        {
            //naive prime factors
            int primeCount = 1;
            for(int i = 3; i < (n-2); i+=2)
            {
                boolean prime = true;
                for(int j = 3; j*j <= i; j +=2)
                {
                    primeSteps++;
                    if(i%j == 0)
                    {
                        prime = false;
                        break;
                    }
                    if(prime) primeCount++;                
                }
                n++;
            }
            //--------------------------------------------------
            //------------------------sieve implementation----------
            boolean[] isPrime = new boolean[n+1];
            int sieveCount = 0;
            for(int i = 1; i < n+1; i++) isPrime[i] = true;
            for(int i = 2; (i*i) < n+1; i++){
                for(int j = i; (j*i)< n+1; j++) 
                {
                    isPrime[i*j] = false;
                }
            }
        
            for(int i = 2; i < n+1; i++){
                if(isPrime[i]) {
                    sieveCount++;
                    sieveSteps++;
                }
            }

            n++; //increment factor to test
        } while(sieveSteps > primeSteps);
        System.out.println("n: " + n + "original steps: " + primeSteps + " sieve steps: " +sieveSteps );
    }
}
