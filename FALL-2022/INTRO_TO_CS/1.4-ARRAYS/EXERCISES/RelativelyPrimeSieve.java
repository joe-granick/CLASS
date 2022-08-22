/* use a matrix prime sieve to find number combos (i && j < n) that are relatively prime
 * a matrix entry prime(i&&J) if i && j if !GCD
 * !GCD if no number x i%x and j%x == 0
 */

public class RelativelyPrimeSieve {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[][] isRelativelyPrime = new boolean[n+1][n+1];
        int offset = n-1; //variable to prevent diagonal duplicates from being initialized to true
        char prime; //track T if relative prime and F otherwios for printing
        int steps = 0;
        
        //initialize unique matrix combos of numbers to true to check for GCD
        //offset value is used to prevent diagonal mirrors of [i][j] so they can be skipped in evaluation
        for(int i = 2; i < n+1; i++){
            for(int j = 2; j < n-offset+2; j++)
            {
                isRelativelyPrime[i][j] = true;            
            }
            offset--;
        }
        for (int i = 2; i <= n; i++){
            for (int j = 2; j <= n; j++){
                if(isRelativelyPrime[i][j]){
                    for (int factor = 2; factor*i <= n; factor++)
                    {
                        if (factor*i <= n && factor*j <= n) isRelativelyPrime[factor*i][j*factor] = false;
                        if(factor*j <= n) isRelativelyPrime[factor][j*factor] = false;
                        if (factor*i <= n) isRelativelyPrime[factor*i][factor] = false;
                        System.out.println("i: " + i + " j: " + j + " factor: " + factor);
                        steps++;
                    }
                }
            }
        }
        // set multiples to false
        /*for(int i = 2; i < n+1; i++){
            for(int j = 2; j < n+1; j++){
                if (isRelativelyPrime[i][j]){ 
                for (int k = 2; (k*i < n+1) && (k*j < n+1); k++){
                    isRelativelyPrime[i*k][j*k] = false;
                    isRelativelyPrime[i*k][k] = false;
                    isRelativelyPrime[k][j*k] = false;
                    steps++;
                }
                isRelativelyPrime[j][j] = false;
                }
                isRelativelyPrime[i][i] = false;         
            }
        }
*/
        int relativePrimeCount = 0;
        for (int j = 0; j < n+1; j++) System.out.print(j + " "); // Column labels
        System.out.println();   
        for (int i = 1; i < n+1; i++){
            System.out.print(i + " "); //Row labels
            for(int j = 1; j < n+1; j++){
                if(isRelativelyPrime[i][j]) {
                    prime = 'T';
                    relativePrimeCount++;
                }
                else                  prime = 'F';
                if(i >= j) System.out.print(prime + " ");
            }
            System.out.println();
            
        }
        System.out.println("Relative Primes: " + relativePrimeCount);
        System.out.println("steps: " + steps);
    }
    
}
