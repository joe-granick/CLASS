public class BinarySearch{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int r = (int)(Math.random()*n)+1 ;
        //int guessCount = 1;
        //StdOut.println("Guess a number between 1 and " + n);
        int guess = n/2;
        int maxGuess = n;
        int minGuess = 1;
        //remember to set scale
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        //StdDraw.setPenRadius(0.05);
        for(int i = 1; i <= n; i++)
        {
            if(i == r) StdDraw.setPenColor(StdDraw.BLACK);
            else       StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.line(i, 0.0, i, i/5);
        }
        while(guess != r)
        {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(guess, 0, guess, guess);
            if(guess < r) 
            {
                //StdOut.println(guess + " too low");
                //gray out any numbers below guess
                for(int i = guess-1; i > 0; i--)
                {
                    StdDraw.enableDoubleBuffering();
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.line(i, 0, i, i);
                }
                minGuess = guess;
                guess = (maxGuess - minGuess)/2 + guess;
            }
            
            else if(guess > r) 
            {
                //StdOut.println(guess + " too high ");
                //gray out any numbers above guess
                for(int i = guess+1; i < n; i++)
                {
                    StdDraw.enableDoubleBuffering();
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.line(i, 0, i, i);
                }
                maxGuess = guess;
                guess = (minGuess - maxGuess)/2 + guess;
            }
            StdDraw.show();
            //guessCount++;
        }
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(r, 0, r, r);
            StdDraw.show();

        //StdOut.println("Correct "+ "guess: " + guess + " number: " + n + " in " +  guessCount + " guesses");
    }

}