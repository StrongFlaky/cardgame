import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

   @Test
   public void verifyThatWeCanGetTheTopCardAndItIsRemoved() {

      Card kingOfClubs = new Card(Rank.king, Suite.clubs);
      Card queenOfDiamonds = new Card(Rank.queen, Suite.diamonds);
      Player player = new Player("as");
      player.addCardToTop(kingOfClubs);
      player.addCardToTop(queenOfDiamonds);

      Assert.assertTrue(player.getTopCard() == queenOfDiamonds);
      Assert.assertTrue(player.getTopCard() == kingOfClubs);
      Assert.assertTrue(player.getCards().isEmpty());
   }

   @Test
   public void verifyThatCardCanBeAddedToTop() {

      Card kingOfClubs = new Card(Rank.king, Suite.clubs);
      Card queenOfDiamonds = new Card(Rank.queen, Suite.diamonds);
      Player player = new Player("asd");
      player.addCardToTop(kingOfClubs);
      player.addCardToTop(queenOfDiamonds);

      Assert.assertTrue(player.getCards().size() == 2);
      Assert.assertTrue(player.getCards().get(0) == kingOfClubs);
      Assert.assertTrue(player.getCards().get(1) == queenOfDiamonds);
   }

   @Test
   public void verifyThatCardCanBeAddedToBottom() {

      Card kingOfClubs = new Card(Rank.king, Suite.clubs);
      Card queenOfDiamonds = new Card(Rank.queen, Suite.diamonds);
      Player player = new Player("");
      player.addCardToTop(kingOfClubs);
      player.addCardToBottom(queenOfDiamonds);

      Assert.assertTrue(player.getCards().size() == 2);
      Assert.assertTrue(player.getCards().get(0) == queenOfDiamonds);
      Assert.assertTrue(player.getCards().get(1) == kingOfClubs);
   }
}
