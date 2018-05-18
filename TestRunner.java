
public class TestRunner {
    
    public static void main(String[] args) {
        
        // create new deck
        Deck deck1 = new Deck();
        
        // create copy of deck1 into new deck called deck2
        Deck deck2 = new Deck(deck1);
        
        // check that deck1 has 52 cards
        System.out.println("Printing size of deck1: ");
        printSize(deck1);
        System.out.println("Printing size of deck2: ");
        printSize(deck2);
        // get a card from top of the deck1 and print it
        printCard(deck1);

        // shuffle deck1 and printCard
        deck1.shuffle();
        printCard(deck1);

        // test deck1 and and deck2 aren't equal after shuffling deck1
        // if equal print True, if not equal print false

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
