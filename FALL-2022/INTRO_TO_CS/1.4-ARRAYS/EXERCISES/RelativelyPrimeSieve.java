/* use a matrix prime sieve to find number combos (i && j < n) that are relatively prime
 * a matrix entry prime(i&&J) if i && j if !GCD
 * !GCD if no number x i%x and j%x == 0
 */

public class RelativelyPrimeSieve {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[][] isRelativelyPrime = new boolean[n+1][n+1];
        char prime; //track T if relative prime and F otherwios for printing
        int steps = 0;
        
        
        //initialize unique matrix combos of numbers to true to check for GCD
        //offset value is used to prevent diagonal mirrors of [i][j] so they can be skipped in evaluation
        for(int i = 1; i <=n; i++)
        {
            for(int j = 1; j <= n; j++) isRelativelyPrime[i][j] = true;            
        }
        for (int i = 2; i < n; i++){
            for (int j = i; j < n; j++){
                if (isRelativelyPrime[i][j])
                {
                    for (int f = 2; i*f <=n && j*f <= n; f++)
                    {
                        isRelativelyPrime[f][f*i] = false;
                        isRelativelyPrime[f*i][f] = false;
                        isRelativelyPrime[f][f*j] = false;
                        isRelativelyPrime[f*j][f] = false;
                        if (i*f != f*j)
                        {
                            isRelativelyPrime[i*f][j*f] = false;
                            isRelativelyPrime[j*f][i*f] = false;
                        }
                        steps++;
                    }
                }
            }
        }
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
                System.out.print(prime + " ");
            }
            System.out.println();
            
            
        }
        System.out.println("steps: " + steps);
        System.out.println("relative primes: " + relativePrimeCount);
    }
    
}
