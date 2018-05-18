// Deck.java
// Deck class represents a deck of 52 unique playing cards

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
    
    private static List<Card> defaultDeck;
    
    static {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                defaultDeck.add(new Card(rank, suit));                   
            }
        }
    }

    public Deck() {
    
    }

    public Deck(List<Card> cards) {

    }
}

