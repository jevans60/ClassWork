
package deckofcards;

public class DeckofCards
{

    public static void main(String[] args) 
    {
       Deck deck = new Deck();
       deck.printDeck();
       deck.shuffle();
       deck.printDeck();
    }
}
