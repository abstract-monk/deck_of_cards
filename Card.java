// Card.java
// Card class represents an instance of a single card in a Deck

public class Card {
    
    public enum Rank { 
        ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT,
        SEVEN, SIX, FIVE, FOUR, THREE, TWO 
    }

    public enum Suit {
        HEARTS, DIAMOND, CLUBS, SPADES
    }

    private final Rank rank;
    private final Suit suit;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public Rank getRank() { return rank; }
    public Suit getSuit() { return suit; }

}
