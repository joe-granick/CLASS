public class AvoidingWalkAvgLim {
    /*Hypothesis, reaches limit around 116 avg steps, as grid becomes almost unescapabale at certain size
     * and converges toward the avergae number of steps to be surrouned
     */
    public static void main(String[] args){
        int trials = Integer.parseInt(args[0]);
        double EPSILON = 1e1;
        double avgSteps = 0.0;
        double prevAvg = 0.0;
        int n = 2;
        do{
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
        prevAvg = avgSteps;
        avgSteps = (escapeSum+deadSum)/(double)trials;
        System.out.println(avgSteps);
        n++;
    } while(Math.abs(avgSteps-prevAvg) < EPSILON);
    
        System.out.println("Average Path lnegth: " + avgSteps + " grid size: " + n + " trials " + trials); 

        }

    }

