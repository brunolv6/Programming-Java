public class ShuffleCards
{
    public static void main(String[] args)
    {
        // declare, create and initialize string of ranks
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // declare, create and initialize string of suits
        String[] suit = {"!", "^", "*", "#"};

        // declare variable
        String[] deck;

        // create and automatic initialize (in the case of double by 0.0)
        deck = new String[52];

        // initialize over the basics in our way suit and rank but made this in a order
        for(int i = 0; i < suit.length; i++){
            for(int k = 0; k < rank.length; k++){
                deck[ 13*i + k ] = rank[k] + suit[i]; 
            }
        }

        // print the deck in order
        for(int t = 0; t < deck.length; t++){
            System.out.printf("%s ", deck[t]);
        }
       
        System.out.printf("\n\n");

        // place where the actual card gonna exchange
        int targetNumber = 0;
        String targetCard = "0";

        // shuffle the deck: go card to card and change its place
        for(int t = 0; t < (deck.length-1); t++){

            // use random method (equally probability) to find a randomized place to exchange places
            targetNumber = ((int)(Math.random()*(52-t))) + t;

            // exchange places between two cards
            targetCard = deck[targetNumber];

            deck[targetNumber] = deck[t];

            deck[t] = targetCard;
        }

        // print out all the deck shuffled
        
        for(int t = 0; t < deck.length; t++){
            System.out.printf("%s ", deck[t]);
        }

        System.out.printf("\n");
    }
}