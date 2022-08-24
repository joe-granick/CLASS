public class MusicShuffle {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] a = new int[n];
        int sequences = 0;
        for(int i = 0; i < n; i++) a[i] = i;

        for(int i = 0; i < trials; i ++){
            for(int j = 0; j < n; j++)
            {
                int r = j + (int)(Math.random()*(n-j));
                int temp = a[j];
                a[j] = a[r];
                a[r] = temp;
            }
            for(int k = 0; k < n-1; k++){
                //System.out.print(a[k] + " ");
                if(a[k+1] == a[k]+1)
                {
                    //System.out.print(a[k+1]);
                    sequences++;
                    break;
                }
            }
            //System.out.println();
        }
        System.out.println("For playist of length " + n + " " + sequences + " sequences found in "  + trials + " trials for " + 100.0*((double)sequences/trials) +"% of trials" );

    }
    
}
