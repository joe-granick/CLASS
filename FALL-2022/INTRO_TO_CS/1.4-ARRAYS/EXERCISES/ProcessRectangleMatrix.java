public class ProcessRectangleMatrix {
    public static void main(String[] args)
    {
        int[][] a = 
        {
            {1, 2, 3, 4},
            {3, 5, 6, 8},
            {9, 10, 11, 12}
        };
        int b[][] = new int[a.length][];
        for (int i = 0; i < a.length; i++)
        {
            b[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++)
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
