import java.util.ArrayList;

public class Deck {

    private ArrayList<FlashCard> deck = new ArrayList<>();

    public ArrayList<FlashCard> getDeck() {
        return deck;
    }

    public void addCard(FlashCard flashCard) {
        deck.add(flashCard);
    }

}
