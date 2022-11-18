public class E2B
{
    public static int[][] readArray()
    {
        int n = StdIn.readInt();
        int[][] mat = new int[n][n];
            for(int row=0; row<n; row++)
            {
                for(int col = 0; col<n; col++)
                {
                    mat[row][col] = StdIn.readInt();
                } 
            }
        return mat;
    }

    public static void printArray(int[][] mat)
    {
        int n = mat.length;
        for(int col=(n-1);col>=0;col--){
            for(int row=(n-1);row>=0;row--)
            {
                StdOut.print(mat[row][col] + " ");
            }
            StdOut.println();
        }
    }

    public static void main (String[] args)
    {
        int[][] mat = readArray();
        printArray(mat);
    }
}