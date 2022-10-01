/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: NET ID: jgranick EMAIL: jgranick@scarletmail.rutgers.edu
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++)
        {
            int currVal = Integer.parseInt(args[i]);
            if(currVal > maxVal) maxVal = currVal;
        }
        System.out.print(maxVal);
    }
}