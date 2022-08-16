
public class ShuffleDeck {
    public static void main(String[] args){
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        String[] deck = new String[suits.length*ranks.length];
        int n = deck.length;
        String shuffledDeck[] = new String[n];

        for(int i = 0; i < ranks.length; i++){
            for(int j = 0; j < suits.length; j++){
                deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
            }   
        }
        for (int k = 0; n-k > 0; k++){
            int shuffleCard = (int)(Math.random()*((double)n-(double)k));
            String card = deck[shuffleCard];
            deck[shuffleCard] = deck[n-k-1]; 
            deck[n-k-1] = card;
        }
        for (int l = 0; l < n; l++) System.out.println("Card " + l + ": " + deck[l]);
    
    }

}