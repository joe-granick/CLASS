public class RelativelyPrime {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        boolean prime;
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                prime = true;
                // checks if i and ja are relatively prime by looping through to see if GCD is 1
                if(i > j){
                    for(int p = 0; p <= j; p++){
                        if(p > 1 && i%p == 0 && j%p == 0){
                            prime = false;
                            //break;
                        }
                    }
                
                }
                else {
                    for(int p = 0; p <= i; p++){
                        if(p > 1 && i%p == 0 && j%p == 0){
                            prime = false;
                            //System.out.print("1");
                            //break;
                        }
                    }
                }
                if(prime) System.out.print( "*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
