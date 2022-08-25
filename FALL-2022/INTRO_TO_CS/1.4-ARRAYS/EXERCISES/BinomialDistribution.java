public class BinomialDistribution{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double[][] a = new double[n][];
        a[0] = new double[1];
        a[0][0] = 0.0;
        a[1] = new double[n];
        a[1][0] = 0.0;
        a[1][1] = 1.0;

        for(int i = 2; i < n; i++){
            a[i] = new double[i+2];
            a[i][0] = 0.0;
            for(int k = 1; k <= i; k++)
            {
                a[i][k] = (a[i-1][k]+a[i-1][k-1])/2.0; 
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < a[i].length-1; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
