import java.util.ArrayList;

public class Deck {

   private ArrayList<Card> cards = new ArrayList<Card>();

   private String[] suiteNames = {"Spade", "Diamond", "Heart", "Club"};

   private String[] rankNames = {"Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

   public Deck(){

      for (int suite = 1; suite <= 4; suite++){
         for(int rank = 1; rank <= 13; rank++){

            cards.add(new Card(rankNames[rank-1], rank, suiteNames[suite-1]) );
         }
      }
   }
}
