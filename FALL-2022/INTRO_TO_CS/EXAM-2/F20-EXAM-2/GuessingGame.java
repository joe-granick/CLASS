
public class GuessingGame{
public static void main(String[] args){
	
	//generate a number between 1 and 1000
	int secretNumber = 1 + (int)(StdRandom.uniform(1000));
	StdOut.println("I'm thinking of a number between 1 and 1,000");
	int guess = 0;

	while(!StdIn.isEmpty()){
		//prompt user for guess and provide an answer
		StdOut.println("What's your guess? ");
		guess = StdIn.readInt();
		if(guess == secretNumber){
			StdOut.println("You win!");
            break;
		}
		else if(guess < secretNumber)
			StdOut.println("Too low");
		
		else
			StdOut.println("Too high");
		}
	}
}
