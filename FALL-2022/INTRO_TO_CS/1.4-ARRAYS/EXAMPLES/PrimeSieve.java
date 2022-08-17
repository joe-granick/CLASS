public class PrimeSieve 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        int primeCount = 0;
        for(int i = 1; i < n+1; i++) isPrime[i] = true;
        /*  Creates array to store value of whether a number is prime with the index representing the number
         * each number looped through multiplied by each other numberwithing bounds of array, multiples are classified as False
         * this cuts down drastically on the numbers needed to do a factor check for, as these false indices can be skipped
        */
        for(int i = 2; (i*i) < n+1; i++){
            System.out.println("-------");
            System.out.println("i"+ " " + "j" + " " + "ij");
            System.out.println("-------");
            for(int j = i; (j*i)< n+1; j++) 
            {
                System.out.print(i+ " " + j + " " + (i*j));
                System.out.println();
                isPrime[i*j] = false;
            }
        }
        //Traditional brute force approach with a smaller array
        for(int i = 3; (i*i) <n+1; i++)
        {
            if(isPrime[i]){
                for(int j = 2; j*j < i; j++)
                {
                    if(i%j == 0) 
                    {
                        isPrime[i] = false;
                        break;
                    }
                }
            }
        }
        for(int i = 2; i < n+1; i++){
            if(isPrime[i]) {
                primeCount++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(primeCount);
    
    }
}
