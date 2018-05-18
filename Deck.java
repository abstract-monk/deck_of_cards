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

    public Deck(Deck cards) {
        deck = new ArrayList<>();
        deck.addAll(cards.deck);
        cardIndex = 0;
    }

    public int getSize() {
        return deck.size();
    }

    // gets a card from the deck without removing it
    public Card getCard() {
        return deck.get(cardIndex);
    }
    
    // gets and removes card from top of the deck
    public Card drawCard() {
        Card c = getCard();
        deck.remove(cardIndex);
        return c;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    
}

