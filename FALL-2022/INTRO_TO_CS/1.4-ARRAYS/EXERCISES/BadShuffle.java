public class BadShuffle {
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] a = new int[m];
        int[][] count = new int[m][m];

        

        //shuffle trials
        for(int k = 0; k < n; k++){
            //intialize a[i] = i
            for(int i = 0; i < m; i++) a[i] = i;
            //shuffle function
            for(int j = 0; j < m; j++)
            {   
                int r = (int)(Math.random()*(m));
                count[a[r]][a[j]]++;
                int temp = a[j];
                a[j] = a[r];
                a[r] = temp;
                
            }
            
        }
        for(int i = 0; i < m; i++){
            System.out.print(i + " ");
            for(int j = 0; j < m; j++)
            {
                System.out.print(count[i][j]/(n/(double)(m)) + " ");
            }
            System.out.println();
        }
    }
    
}
