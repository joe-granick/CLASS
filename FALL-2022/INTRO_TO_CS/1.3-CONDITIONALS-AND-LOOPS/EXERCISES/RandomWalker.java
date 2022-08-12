/* 

Intro To CS Interdisciplinary Approach
1.3 Conditionals and  Loops
Exercise 1.3.37 pg 86 2D Random Walk:
Create: 2nx2n grid
Start at center of grid
Random Uniform Probability of moving n/s/e/w
How long does it take to leave the grid

*/

public class RandomWalker {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int upperBound = 2*n;
        int lowerBound = 0;
        int steps = 0;
        double averageSteps = 0;
        int count = 0;
        for(int trial = 0; trial < trials; trial++){
            int x = n; // use x to track horizontal intialize to midpoint pof 2n
            int y = n;// use x to track horizontal intialize to midpoint pof 2n
            while (x <= upperBound && y <= upperBound && x >= lowerBound && y >= lowerBound){
                double p = Math.random();
                if      (p >= 0.75){ 
                    x++;
                    System.out.print("E");
                }
                else if (p >= 0.50){ 
                    x--;
                    System.out.print("W");
                }
                else if (p >= 0.25){
                     y++;
                     System.out.print("N");
                }
                else {
                    y--;
                    System.out.print("S");
                steps++;
            }

        }
        count++;
        averageSteps = ((double)steps)/((double)count);
        System.out.println();
        System.out.println("Trials: " + count + " Steps: " + steps + " Averge Steps per Trial" + averageSteps);        
    }    
    System.out.println("Trials: " + count + " Steps: " + steps + " Averge Steps for " + upperBound + "x" + upperBound + " grid: " + averageSteps);
}
}
