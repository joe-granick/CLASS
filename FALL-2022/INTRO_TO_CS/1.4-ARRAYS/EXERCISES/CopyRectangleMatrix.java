public class CopyRectangleMatrix {
    public static void main(String[] args)
    {
        int[][] a = 
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        int n = a.length;
        int m = a[0].length;
        int b[][] = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                b[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j=0; j < m; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
