public class SelfAvoidingLattice {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnd = 0;
        int escape = 0;
        int escapeSum = 0;
        int deadSum = 0;
        for (int i = 0; i < trials; i++)
        {
            boolean[][][] blockVisited = new boolean[n][n][n];
            boolean trapped = false;
            int x = n/2;
            int y = x;
            int z = x;
            int steps = 0;
        while((x > 0 && x < n-1)  && (y > 0 && y < n-1) && (z > 0 && z < n-1) )
        {
            blockVisited[x][y][z] = true;
            double r = Math.random();
            if(blockVisited[x+1][y][z] && blockVisited[x-1][y][z] && blockVisited[x][y+1][z] && blockVisited[x][y-1][z] && blockVisited[x][y][z+1]&& blockVisited[x][y][z-1])
            {
                deadEnd++;
                deadSum += steps;
                trapped = true;
                break;
            }

            if(r < (1.0/6.0))      {if(!blockVisited[x+1][y][z]) x++;}
            else if(r < (2.0/6.0)) {if(!blockVisited[x-1][y][z]) x--;}  
            else if(r < (3.0/6.0)) {if(!blockVisited[x][y+1][z]) y++;}
            else if(r < (4.0/6.0)) {if(!blockVisited[x][y-1][z]) y--;} 
            else if(r < (5.0/6.0)) {if(!blockVisited[x][y][z+1]) z++;} 
            else              {if(!blockVisited[x][y][z-1]) z--;} 
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
