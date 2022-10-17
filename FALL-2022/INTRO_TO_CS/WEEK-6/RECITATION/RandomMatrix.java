public class RandomMatrix {
    public static void main(String[] args)
    {
        int zeroCount = 0;
        int oneCount = 0;

    
        int[][] matrix2d = {
                            {1,0,1,0},
                            {1,1,0,1},
                            {1,0,0,1},
                            {0,0,1,0}
                            };
        for(int i = 0; i < matrix2d.length; i++)
        {
            for(int j = 0; j < matrix2d[i].length; j++)
            {
                if(matrix2d[i][j] == 0) zeroCount++;
                if(matrix2d[i][j] == 1) oneCount++;
            }
            
        }
            System.out.println(zeroCount);
            System.out.println(oneCount);
    }
    
}
