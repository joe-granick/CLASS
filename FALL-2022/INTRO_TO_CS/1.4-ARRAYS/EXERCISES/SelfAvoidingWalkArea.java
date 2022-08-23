public class SelfAvoidingWalkArea {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnd = 0;
        int escape = 0;
        int escapeSum = 0;
        int deadSum = 0;
        int deadEndArea = 0; // I guess this needs initialization here
        
        //initialize grid for displaying walk
        for (int i = 0; i < trials; i++)
        {
            boolean[][] blockVisited = new boolean[n][n];
            boolean trapped = false;
            int x = n/2;
            int y = x;
            int steps = 0;

            //track maximumun and minimum height and width to find area of encomappsing rectangle
            int maxX = x;
            int maxY = y;
            int minX = x;
            int minY = y;
        // while the automaton is within the bounds of the grid keep moving
        while((x > 0 && x < n-1) && (y > 0 && y < n-1))
        {
            blockVisited[x][y] = true;
            double r = Math.random();
            //check if path is clear
            if(blockVisited[x+1][y] && blockVisited[x-1][y] && blockVisited[x][y+1] && blockVisited[x][y-1])
            {
                deadEnd++; // increment dead end count if trapped
                deadSum += steps;
                trapped = true;
                deadEndArea += ((maxX - minX)*(maxY-minY));
                break; //escape from trial if trapped
            }

            if(r < 0.25) {if(!blockVisited[x+1][y]) x++;}
            else if(r < 0.5) {if(!blockVisited[x-1][y]) x--;}  
            else if(r < 0.75) {if(!blockVisited[x][y+1]) y++;}
            else             {if(!blockVisited[x][y-1]) y--;}
            //random assignemnt determines next move
            // if next move if blocked move to test for deadEnd and re-randomize
            if (x > maxX) maxX = x;
            if (x < minX) minX = x;
            if (y > maxY) maxY = y;
            if (y <  minY) minY = y; 
            steps++;
            /* 
            //prints each move
            for (int a = 0; a < n; a++){ 
                for (int b = 0; b < n; b++)
                {   
                    if(blockVisited[a][b]) System.out.print("x" + " ");
                    else                   System.out.print("o" + " ");
                }
                System.out.println();
            }
            System.out.println();
            */
        }
        if (!trapped){
            escape++;
            escapeSum+= steps;
        }
        //print final grid for each trial
        for (int a = 0; a < n; a++) System.out.print(a + " ");
            System.out.println();
            for (int a = 0; a < n; a++){ 
                System.out.print(a + " ");
                for (int b = 0; b < n; b++)
                {   
                if(blockVisited[a][b]) System.out.print("x" + " ");
                else                   System.out.print("o" + " ");
                }
                System.out.println();
            }
            System.out.println();
        
        
    }
        
        System.out.println(deadEnd +" deadends in " + trials + " trials");
        System.out.println("Deadends:  " + deadEnd/(double)trials*100.00 + " percent of  trials");
        System.out.println("Average Escape Path: " + (double)escapeSum/(double)escape + " steps" + "Total steps: " + escapeSum + " Escapes: " + escape); 
        System.out.println("Average Deadend Path: " + (double)deadSum/(double)deadEnd + " steps " + "Total steps: " + deadSum);
        System.out.println("Average Deadend Area: " + deadEndArea/(double)deadEnd);

        }

    }
