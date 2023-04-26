import java.util.ArrayList;

public class Uno {
    private Card current; // the current card or previously played card or starting card
    private Deck deck; // the deck of the game
    private ArrayList<Card> cardpile; // when players throw a card, it piles up here, and creates a new deck if the current deck is empty
    private int penalty; // when wildcards stack up the penalty stacks up. If a player is unable to counter the current wildcard on play, player is penalised "penalty".
    private scanner choice;
    private Player p1,p2; // player 1 and 2
    private int pick; // players pick

    public Uno(){
        deck = new Deck();
        deck.shuffle();
        penalty = 0;
        current = getStartingCard();
        cardpile = new ArrayList<Card>();
        cardpile.add(current);
        choice = new Scanner(System.in);
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        distributecards();
    }

    public void game(){
        int turn = 0;

    }
}
