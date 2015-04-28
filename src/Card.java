public class Card {

   private final String rank;
   private final int value;
   private final String suit;

   public Card(String rank, int value, String suit) {

      this.rank = rank;
      this.value = value;
      this.suit = suit;
   }

   public int compare(Card otherCard){

      return value - otherCard.value;

   }
}
