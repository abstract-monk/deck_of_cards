
public class TestRunner {
    
    public static void main(String[] args) {
        
        // create new deck and test it has 52 cards
        Deck deck1 = new Deck();
        printSize(deck1);

        // get a card from the deck and print it
        printCard(deck1);
    }

    public static void printSize(Deck d) {
        System.out.println(d.getSize());
    }
    
    public static void printCard(Deck d) {
        Card c = d.getCard();
        System.out.println(c);
    }
}
