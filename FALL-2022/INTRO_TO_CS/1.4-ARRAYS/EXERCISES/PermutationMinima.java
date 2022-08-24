public class PermutationMinima {
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] a = new int[n];
        int minCount = 0;
        for(int trials = 0; trials < m; trials++)
        {
            for(int i = 0; i < n; i++) a[i] = i;
            for(int i = 0; i < n; i++)
            {
                int r = i + (int)(Math.random()*(n-i));
                int temp = a[r];
                a[r] = a[i];
                a[i] = temp;
                //a[r] = i;
                //a[i] = r;
                //System.out.print(a[i] + " ");
            }
            //System.out.println();
            int minima = a[0];
            for(int k = 1; k < n; k++)
            {
                if(a[k] < minima)
                { 
                    minima = a[k];
                    minCount++;
                }
            }
            System.out.print("left-right minima: " + minCount);
            System.out.println();
    }
    System.out.print("average number of left-right minima in "+ n + " length permuations: " + minCount/(double)m);
}
    
}
