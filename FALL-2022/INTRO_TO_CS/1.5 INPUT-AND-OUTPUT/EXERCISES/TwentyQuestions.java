public class TwentyQuestions {
    public static void main(String[] args)
    {
        int secret = 1 + (int)(Math.random() * 1000000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int guess = 0;
        int count = 0;
        while(guess != secret)
        {
            StdOut.print("What's your guess ");
            guess = StdIn.readInt();
            count++;
        if (guess == secret) StdOut.print("You guessed correctly in " + count + " guesses ");
        if (guess < secret) StdOut.print("Too low ");
        if (guess > secret) StdOut.print("Too high ");


        }
    }
    
}
