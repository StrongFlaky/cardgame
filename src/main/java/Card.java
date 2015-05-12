public class Card {

   private Rank rank;
   private Suite suite;

   public Card(Rank rank, Suite suite) {

      this.rank = rank;
      this.suite = suite;
   }

   public int compare(Card otherCard) {

      return rank.ordinal() - otherCard.rank.ordinal();
   }
}
