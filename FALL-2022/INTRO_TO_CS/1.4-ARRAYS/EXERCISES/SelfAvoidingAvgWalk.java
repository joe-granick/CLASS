public class SelfAvoidingAvgWalk {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnd = 0;
        int escape = 0;
        int escapeSum = 0;
        int deadSum = 0;
        for (int i = 0; i < trials; i++)
        {
            boolean[][] blockVisited = new boolean[n][n];
            boolean trapped = false;
            int x = n/2;
            int y = x;
            int steps = 0;
        while((x > 0 && x < n-1) && (y > 0 && y < n-1))
        {
            blockVisited[x][y] = true;
            double r = Math.random();
            if(blockVisited[x+1][y] && blockVisited[x-1][y] && blockVisited[x][y+1] && blockVisited[x][y-1])
            {
                deadEnd++;
                deadSum += steps;
                trapped = true;
                break;
            }

            if(r < 0.25) {if(!blockVisited[x+1][y]) x++;}
            else if(r < 0.5) {if(!blockVisited[x-1][y]) x--;}  
            else if(r < 0.75) {if(!blockVisited[x][y+1]) y++;}
            else             {if(!blockVisited[x][y-1]) y--;} 
            
            steps++;
        }
        if (!trapped){
            escape++;
            escapeSum+= steps;
        }

    }
        System.out.println(deadEnd +" deadends in " + trials + " trials");
        System.out.println("Deadends:  " + deadEnd/(double)trials*100.00 + " percent of  trials");
        System.out.println("Average Escape Path: " + (double)escapeSum/(double)escape + " steps" + "Total steps: " + escapeSum + " Escapes: " + escape); 
        System.out.println("Average Deadend Path: " + (double)deadSum/(double)deadEnd + " steps " + "Total steps: " + deadSum);


        }

    }
