import org.junit.Assert;
import org.junit.Test;

public class GameTest {

   @Test
   public void gameCanBePlayed() {

      Game game = new Game();
      Player winner = game.play();

      int player1Cards = game.getPlayer1().getCards().size();
      int player2Cards = game.getPlayer2().getCards().size();

      Assert.assertTrue(winner != null);
      Assert.assertTrue(player1Cards == 0 || player2Cards == 0);
   }
}
