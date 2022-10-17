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
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		int n = args.length;
		int[] dupVal = new int[n];
		int max = 0;
		int num;

		for (int i = 0; i < n; i++)
		{
			num = Integer.parseInt(args[i]);
			dupVal[i] = num;
			if(num > max) max = num;
		}

		int[] hasDup = new int[max+1];
		boolean duplicate = false;
		for(int i = 0; i < n; i++)
		{
			if(hasDup[dupVal[i]] == 1)
			{
				duplicate = true;
				break;
			}
			else hasDup[dupVal[i]] = 1;
		}
		System.out.println(duplicate);
		//System.out.println(max);
		//System.out.println(hasDup.length);
		//WRITE YOUR CODE HERE
	}
}
