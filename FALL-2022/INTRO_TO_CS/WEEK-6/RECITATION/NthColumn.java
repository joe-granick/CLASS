public class NthColumn {
    public static void main(String[] args)
    {
        int colNum = Integer.parseInt(args[0]);
        int[][] matrix2d = {
                            {1,0,1,0},
                            {1,1,0,1},
                            {1,0,0,1},
                            };
        for(int i = 0; i < matrix2d.length; i++)
        {
            System.out.println(matrix2d[i][colNum]);   
        }

    }
    
}