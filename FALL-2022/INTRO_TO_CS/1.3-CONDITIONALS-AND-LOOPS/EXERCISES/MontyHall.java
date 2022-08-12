/* 1.3.42 Pg 88
 *  Monty Hall Problem
 * test which strategy is more likely to succed over n round
 * 
 * Strategy 1: changeing when door is opened
 * 
 * or
 * 
 * Strategy 2: changing when door is removed
 * 
 * 
 * 
*/

public class MontyHall {
   public static void main(String[] args){
    int n = Integer.parseInt(args[0]); // number of rounds to play
    int switchY = 0;
    int switchN = 0;
    double dSum = 0.0;
    double cSum = 0.0;
    int count = 1;

    for(int i = 0; i < n; i++){
        int  door = (int)(3.0*Math.random());
        int choice = (int)(3.0*Math.random());
        dSum = dSum + door;
        cSum = cSum + door;
        System.out.println("door: " + door + " " + "choice: " + choice);
    }
    System.out.println("door: " + (dSum/n) + " " + "choice: " + (cSum/n));
   } 
}
