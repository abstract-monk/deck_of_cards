// Deck.java
// Deck class represents a deck of 52 unique playing cards

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
    
    private static List<Card> defaultDeck = new ArrayList<Card>();
    private List<Card>        deck;
    private int               cardIndex;
    
    static {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                defaultDeck.add(new Card(rank, suit));                   
            }
        }
    }

    public Deck() {
        deck = new ArrayList<>(defaultDeck);
        cardIndex = 0;
    }

    public Deck(List<Card> cards) {

    }
}

