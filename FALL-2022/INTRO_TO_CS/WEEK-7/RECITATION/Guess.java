public class Guess{
    public static void main(String[] args)
    {
        int n = (int)(Math.random()*1000)+1 ;
        int guessCount = 0;
        StdOut.println("Guess a number between 1 and 1000");
        while(!StdIn.isEmpty())
        {
            guessCount++;
            int guess = StdIn.readInt();
            if(guess == n)
            {
                StdOut.println("Correct "+ "guess: " + guess + " number: " + n + " in " +  guessCount + " guesses");
                break;
            }
            if(guess < n) StdOut.println("too low");
            if(guess > n) StdOut.println("too high ");
        }
    }

}