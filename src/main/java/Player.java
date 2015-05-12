import java.util.ArrayList;
import java.util.Queue;

public class Player {

   public static final int BOTTOM_INDEX = 0;

   private final String name;
   private ArrayList<Card> cards = new ArrayList<Card>();

   public Player(String name){

      this.name=name;
   }

   public void addCardToTop(Card card){

      cards.add(card);
   }

   public void addCardToBottom(Card card) {

      cards.add(0, card);

   }

   public Card getTopCard() {

      int indexOfTopCard = cards.size() - 1;
      Card card = cards.get(indexOfTopCard);
      cards.remove(indexOfTopCard);
      return card;
   }

   // This method is only needed for the unit test
   public ArrayList<Card> getCards() {

      return cards;
   }

   @Override
   public String toString() {

      return name;
   }
}
