public class MatrixMultiplication {
   public static void main(String[] args){
    int n = 2;
    int m = 2;
    //double[][] matrixA = new double[n][n];
    //double[][] matrixB = new double[m][m];
    double matrixA[][] = 
    {
        {1.0, 2.0},
        {3.0, 4.0}
    };
    double matrixB[][] = 
    {
        {1.0, 2.0},
        {3.0, 4.0}
    };

    int aRow = matrixA.length;
    int aCol = matrixA[0].length;

    int bRow = matrixB.length;
    int bCol = matrixB[0].length;
    
    double[][] matrixProduct = new double[bRow][bCol]; 

    for(int i = 0; i < aRow; i++){
        for(int j = 0; j < bCol; j++){
            for(int k = 0; k< aRow; k++)
            {
                matrixProduct[i][j] += matrixA[i][k]*matrixB[k][j];
            }
        }

        }
        for(int i = 0; i < matrixProduct.length; i++){
            for(int j = 0; j < matrixProduct[0].length; j++)
            {
                System.out.print(matrixProduct[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

   } 
}
