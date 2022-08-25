public class RandomWalk {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnd = 0;
        int numTrials = 0;
        for (int i = 0; i < trials; i++)
        {
            boolean[][] blockVisited = new boolean[n][n];
            int x = n/2;
            int y = x;
            numTrials++;
        while((x > 0 && x < n-1) && (y > 0 && y < n-1))
        {
            blockVisited[x][y] = true;
            double r = Math.random();
            if(blockVisited[x+1][y] && blockVisited[x-1][y] && blockVisited[x][y+1] && blockVisited[x][y-1])
            {
                deadEnd++;
                break;
            }

            if(r < 0.25) {if(!blockVisited[x+1][y]) x++;}
            else if(r < 0.5) {if(!blockVisited[x-1][y]) x--;}  
            else if(r < 0.75) {if(!blockVisited[x][y+1]) y++;}
            else             {if(!blockVisited[x][y-1]) y--;}   


        }

    }
        System.out.println(deadEnd +" deadends in " + trials + " trials");
        System.out.println("avg:  " + deadEnd/(double)trials + " per trial");


        }

    }
