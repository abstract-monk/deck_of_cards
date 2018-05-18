
public class TestRunner {
    
    public static void main(String[] args) {
        
        // create new deck and test it has 52 cards
        Deck deck1 = new Deck();
        printSize(deck1);

        // get a card from top of the deck and print it
        printCard(deck1);

        // shuffle deck1 and printCard
        deck1.shuffle();
        printCard(deck1);

        // draw card from top of deck and print it showing size of deck
        // before and after drawing occurs
        drawAndPrintCard(deck1);

    }

    public static void printSize(Deck d) {
        System.out.println("Size of deck is: " + d.getSize());
    }
    
    public static void printCard(Deck d) {
        Card c = d.getCard();
        System.out.println("The " + c + "is the next card in the deck");
    }

    public static void drawAndPrintCard(Deck d) {
        Card c;
        printSize(d);
        c = d.drawCard();
        System.out.println("The " + c + " was drawn.");
        printSize(d);
    }
}
