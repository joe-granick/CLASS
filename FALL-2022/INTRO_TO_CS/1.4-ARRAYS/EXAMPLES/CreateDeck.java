package EXAMPLES;
public class CreateDeck {
    public static void main(String[] args){
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        String[] deck = new String[suits.length*ranks.length];

        for(int i = 0; i < ranks.length; i++){
            for(int j = 0; j < suits.length; j++){
                deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
            }   
        }
        for(int k= 0; k < deck.length; k++) System.out.println(deck[k]);
    }

}