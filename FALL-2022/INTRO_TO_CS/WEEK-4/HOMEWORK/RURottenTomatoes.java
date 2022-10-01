/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
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
		int reviewers = Integer.parseInt(args[0]);
		int movies = Integer.parseInt(args[1]);
		int[][] reviews = new int[reviewers][movies];
		
		for(int i = 0; i < reviewers; i++){
			for(int j = 0; j < movies; j++)
			{
				reviews[i][j] = Integer.parseInt(args[2+i + j]);	
				System.out.print(reviews[i][j] + " ");
			}
			System.out.println();
		
		}
	}
}
