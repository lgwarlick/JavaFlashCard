import java.util.ArrayList;

public class Deck {

    ArrayList<FlashCard> deck = new ArrayList<>();

    private int deckSize = deck.size();
    private int nextCardID = deckSize+1;

    public int getDeckSize() {
        return deckSize;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    public int getNextCardID() {
        return nextCardID;
    }

    public void setNextCardID(int nextCardID) {
        this.nextCardID = nextCardID;
    }

    public void addCard(FlashCard flashCard) {
        deck.add(flashCard);
    }

}
