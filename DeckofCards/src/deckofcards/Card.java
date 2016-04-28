
package deckofcards;


public class Card
{
    String toString;
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

    
    private int card;

    Card(int cardValue)
    {
        card = cardValue;
    }
    
    public int getCard()
    {
        return card;
    }
    
    public void printCard()
    {
        System.out.print(this + " ");
    }
    
    public String toString()
    {
       return getRank() + " of " + getSuit() + " *";
    }
    
    private String getRank()
    {
        return ranks[card%13];
    }
    
    private String getSuit()
    {
        return suits[card/13];
    }
    
}
