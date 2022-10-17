/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Joseph Granick NET ID: jgranick EMAIL: jgranick@scarletmail.rutgers.edu
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int 	reviewN = Integer.parseInt(args[0]);
		int  	 movieN = Integer.parseInt(args[1]);
		int[][] reviews =  new int[reviewN][movieN];
		int[] reviewSum	= 			new int[movieN];
		int    maxScore =         Integer.MIN_VALUE; 
		int	   maxIndex = 0;
		for (int i = 0; i < reviewN; i++) {
			for(int j = 0; j < movieN; j++)
			{
				int score 		= Integer.parseInt(args[(i*movieN) + j + 2]);
				reviews[i][j] 	= 								  score;
				reviewSum[j] += score;
				//System.out.print(reviews[i][j] + " ");
			}
			//System.out.println();
		}			

		//for(int i = 0; i < movieN; i++) System.out.print(reviewSum[i] + " ");
		//System.out.println();


		for (int i = 0; i < reviewSum.length; i++)
		{
			//System.out.println(reviewSum[i]);
			if (reviewSum[i] > maxScore)
			{	
				maxScore = reviewSum[i];
				maxIndex = 			  i;
			}
		}
		System.out.print(maxIndex);
	}
}
