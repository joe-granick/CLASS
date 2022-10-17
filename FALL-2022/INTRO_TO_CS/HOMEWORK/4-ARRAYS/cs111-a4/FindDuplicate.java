/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Joseph Granick NET ID: jgranick EMAIL: jgranick@scarletmail.rutgers.edu 
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		//WRITE YOUR CODE HERE
		{
			int n = args.length;
			int[] dupArr = new int[n];
			boolean dup = false;
			for (int i = 0; i < n; i++) dupArr[i] = Integer.parseInt(args[i]); //Initialize array with CLI input
		
			for (int i = 0; i < n; i++){ 
				for (int j = (i+1); j < n; j++) // loop through rest of array comparing to ith index entry
				{
					if(dupArr[j] == dupArr[i]) 
					{
						dup = true; //if j index matches i index comparison break loop and assign duplicate to true
						break;
					}
				}
			}
			System.out.print(dup);
		}	

	}
}
