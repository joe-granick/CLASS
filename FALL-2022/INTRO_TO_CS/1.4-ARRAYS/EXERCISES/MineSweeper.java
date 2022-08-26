public class MineSweeper {
    public static void main(String[] args)
    {
        int m    =   Integer.parseInt(args[0]);
        int n    =   Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        boolean[][] grid      = new boolean[m][n]; // grid tracking whether cell contains bomb;
        int[][] neighborBombs = new int[m+2][n+2]; //grid tracking count of neighboring bombs
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
            {
            if(Math.random() <= p) grid[i][j] = true;
            }
        }
        char mine;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
            {
            if(grid[i][j]) mine = '*';
            else mine = '.';
            System.out.print(mine + " ");
            }
            System.out.println();
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++)
            {
            if(!grid[i][j])
            {
                if(grid[i-1][j]) neighborBombs[i][j]++; // bomb above i
                if(grid[i+1][j]) neighborBombs[i][j]++; // bomb below i
                if(grid[i][j-1]) neighborBombs[i][j]++; // bomb left j
                if(grid[i][j+1]) neighborBombs[i][j]++; // bomb right j
                if(grid[i-1][j-1]) neighborBombs[i][j]++; // bomb above/left i,j
                if(grid[i-1][j+1]) neighborBombs[i][j]++; // bomb above/right i,j
                if(grid[i+1][j-1]) neighborBombs[i][j]++; // bomb below/left i,j
                if(grid[i+1][j+1]) neighborBombs[i][j]++; // bomb below/right i,j
                System.out.print(neighborBombs[i][j] + " ");
                
            }
            else System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}
