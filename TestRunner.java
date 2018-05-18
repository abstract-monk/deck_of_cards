
public class TestRunner {
    
    public static void main(String[] args) {
        
        // create new deck and test it has 52 cards
        Deck deck1 = new Deck();
        printSize();
    }

    public void printSize(Deck d) {
        System.out.println(d.getSize());
    }

}
