public class PrimeCounter {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int primeCount = 0;
        int set = 3;
        for(int i = 3; i < (n-2); i+=2)
        {
            boolean prime = true;
            for(int j = 3; j < (i-2); j +=2)// set to j*j < i because if it reached j*j
            {
                if(i%j == 0)
                {
                    prime = false;
                    break;
                }
                //System.out.println("i" + " " + "j" + " " + "prime" +" "+ "ct");
                //System.out.println(i+ " " + j + " " + prime+ " " + primeCount);
                set = j;
            }
            if(prime) primeCount++;
            System.out.println(primeCount);
        }
        
    }
    
}
