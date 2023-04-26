import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playercards;
    private String name; // player name

    public Player(String name){
        playercards = new ArrayList<Card>();
        this.name = name;
    }

    public int numberOfCards(){
       return playercards.size();
    }

    public ArrayList<Card> PlayerCards(){
        return playercards;
    }
}
