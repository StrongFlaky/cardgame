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

      int numberOfRounds = 0;

      while (numberOfRounds++ < 10) {

         System.out.println("---------------");
         System.out.println(player1.getCards());
         System.out.println(player2.getCards());

         Card player1TopCard = player1.getTopCard();
         Card player2TopCard = player2.getTopCard();

         int result = player1TopCard.compare(player2TopCard);

         if (result < 0) {
            player2.addCardToBottom(player1TopCard);
            player2.addCardToBottom(player2TopCard);
         }
         else if (result > 0) {
            player1.addCardToBottom(player1TopCard);
            player1.addCardToBottom(player2TopCard);
         }
         else {
            player1.addCardToBottom(player1TopCard);
            player2.addCardToBottom(player2TopCard);
         }
      }

      System.out.println("Winning hand ---------------");
      System.out.println(player1.getCards());
      System.out.println(player2.getCards());

      if (player2.getCards().size() > player1.getCards().size()) {
         return player2;
      }
      else if (player1.getCards().size() > player2.getCards().size()) {
         return player1;
      }
      else {
         return null;
      }
   }

   public static void main(String[] args) {

      Game game = new Game();
      Player winner = game.play();

      System.out.println("!!!!!!!!!!!!!!!!!!!!!");
      if (winner != null) {
         System.out.println("Winner is " + winner);
      }
      else {
         System.out.println("No winner");
      }
   }
}
