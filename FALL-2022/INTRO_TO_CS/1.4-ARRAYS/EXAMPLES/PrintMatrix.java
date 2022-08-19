public class PrintMatrix {
   public static void main(String[] args){
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    double[][] matrixA = new double[m][n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            System.out.print(matrixA[i][j] + " ");
              
        }
        System.out.println();
    }

   } 
}
