public class Transpose {
    public static void main(String[] args)
    {
        int[][] matrix = 
        {
            {99, 98, 92, 94, 99, 90, 76, 92, 97, 89},
            {85, 57, 77, 32, 34, 46, 59, 66, 71, 29},
            {98, 78, 76, 11, 22, 54, 88, 89, 24, 38}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrixTransform = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrixTransform[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matrixTransform[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
