
package deckofcards;


public class Deck
{
   private Card[]cards;
   
   Deck()
   {
       cards = new Card[52]; 
       for (int i = 0; i < cards.length; i++) 
       {
       cards[i] = new Card(i);    
       }
   }
   
   public void printDeck()
   {
       for(Card i: cards)
       {
           System.out.println(i);
           System.out.println("***********************************");
           i.printCard();
           
           
       }
   }
   
   public void shuffle()
   {
       for (int i = 0; i < cards.length; i++) 
       {
           int otherCard = (int)(Math.random() * cards.length); 
           this.swapCards(i, otherCard);
       }
   }
   
   private void swapCards(int firstCard, int secondCard)
   {
       Card temp = cards[firstCard];
       cards[firstCard] = cards[secondCard];
       cards[secondCard] = temp;
    }
}
