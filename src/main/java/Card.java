public class Card extends Object {

   private Rank rank;
   private Suite suite;

   public Card(Rank rank, Suite suite) {

      this.rank = rank;
      this.suite = suite;
   }

   public int compare(Card otherCard) {

      return rank.ordinal() - otherCard.rank.ordinal();
   }

   @Override
   public String toString() {

      return rank.name() + " " + suite.name();
   }
}
