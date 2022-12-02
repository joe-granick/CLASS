/* 1.3.42 Pg 88
 *  Monty Hall Problem
 * test which strategy is more likely to succed over n round
 * 
 * Strategy 1: changing when door is opened
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
    int switchY = 0; // increment if switching doors after the door is checked wins
    int switchN = 0; // increment if sticking with original choice wins
    //int checkDoor;

    for(int i = 0; i < n; i++){
        int  door = (int)(3.0*Math.random());
        int choice = (int)(3.0*Math.random());
        if (door == choice) switchN++;
        if (door != choice) switchY++;
        System.out.println("stay: " + switchN + " " + "change: " + switchY);
        /*
        *do{
        *    checkDoor = (int)(3.0*Math.random());
        *   } while(checkDoor == door || checkDoor == choice);
        */
    }
    
    System.out.println("stay: " + ((double)switchN/n) + " " + "change: " + ((double)switchY/n));
   } 
}
