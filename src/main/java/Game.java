public class Game {

   private Deck deck = new Deck();

   private Player player1 = new Player("Nathan");
   private Player player2 = new Player("Will");

   public Player getPlayer1() {

      return player1;
   }

   public Player getPlayer2() {

      return player2;
   }

   public Player play() {

      deck.dealCards(player1, player2);

      int result = player1.getCards().get(0).compare(player2.getCards().get(0));

      while (player1.getCards().size() > 0 && player2.getCards().size() > 0) {
         if (result < 0) {
            player2.addCardToBottom(player1.getTopCard());
            player2.addCardToBottom(player2.getTopCard());

         }
         else if (result == 0) {
            player1.addCardToBottom(player1.getTopCard());
            player2.addCardToBottom(player2.getTopCard());
         }
         else {
            player1.addCardToBottom(player1.getTopCard());
            player1.addCardToBottom(player2.getTopCard());
         }
      }

      if (player2.getCards().size() > 0) {
         return player2;
      }
      else if (player1.getCards().size() > 0) {
         return player1;
      }
      else {
         throw new IllegalStateException("No winner");
      }
   }

   public static void main(String[] args) {

      Game game = new Game();
      Player winner = game.play();

      System.out.println(winner);
   }
}
