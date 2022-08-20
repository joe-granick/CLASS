public class CopySquareMatrix {
    public static void main(String[] args)
    {
        int[][] a = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = a.length;
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                b[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < b.length; i++)
        {
            for (int j=0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
