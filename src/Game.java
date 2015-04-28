public class Game {

   public static void main(String[] args) {

      Deck deck= new Deck();
      Card one = new Card("king", 13, "heart");
      Card two = new Card("Ace", 1, "spade");

      System.out.println(one.compare(two));
   }
}
