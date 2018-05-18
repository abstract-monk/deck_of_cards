
// Test Class to test functions for shuffling a deck of cards and drawing 
// cards from a deck one at a time until the deck is empty.

import java.util.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CardDeckTest {

    private List<Card>      cards;
    private Deck            deck1;
    private Deck            deck2;
    private Card            card;

    @Before
    cards = new ArrayList<>(Card);
    deck1 = new Deck();
    deck2 = new Deck(cards);

    @Test
    public void shuffleTest() {
        
    }

}
