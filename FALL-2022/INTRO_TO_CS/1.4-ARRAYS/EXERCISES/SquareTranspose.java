public class SquareTranspose {
    public static void main(String[] args)
    {
        int[][] matrix = 
        {
            {99, 98, 92},
            {85, 57, 77},
            {98, 78, 76}
        };
        int m = matrix.length;
        int offset = 0;
        for (int i = offset; i  < m; i++)
        {
            for (int j = offset; j + offset < m; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            offset++;
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
