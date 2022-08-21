public class RelativelyPrimeSieve {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[][] isRelativelyPrime = new boolean[n+1][n+1];
        int offset = n;
        
        char prime;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-offset; j++)
            {
                isRelativelyPrime[i][j] = true;
                
            }
            offset--;
        }
            for (int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(isRelativelyPrime[i][j]) prime = 'T';
                    else                  prime = 'F';
                    System.out.print(prime + " ");
                }
                System.out.println();
            }
        /*for (int i = 2; i*i < n; i++)
        {
            for (int j = 2; j < n; j++)
            {
                if (isRelativelyPrime[i][j])
                    {
                    isRelativelyPrime[i][j] = false;
                    }
                }
        }*/
        

    }
    
}
