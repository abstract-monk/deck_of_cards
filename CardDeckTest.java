
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

    /* 
     Create deck1 as full deck, and deck2 as empty deck. Make deep copy of 
     full deck to empty deck. Shuffle the first deck. Assert deck1 not equal
     to deck2 after shuffle.
     Note: since shuffle is random, it's possible for this to fail occasionally.
    */
    @Test
    public void shuffleTest() {
        
    }
    
    /*
     Create a full deck of cards. Create card variable to hold drawn cards.
     Create count variable. Set count equal to number of cards in the deck.
     Draw enough cards to empty deck. Attempt to draw card from an empty deck.
     Assert card variable equals null.
    */
    @Test
    public void drawAllCardsTest() {
        
    }
}
