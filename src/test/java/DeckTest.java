import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

   @Test
   public void verifyThatWeCanGetTheTopCardFromTheDeckAndTheCardIsRemovedFromTheDeck() {

      Deck deck = new Deck();

      Assert.assertTrue(deck.getCards().size() == 52);
      Assert.assertTrue(deck.getTopCard() != null);
      Assert.assertTrue(deck.getCards().size() == 51);
   }

   @Test
   public void verifyThatDeckHas26CardsLeftAfterDealing() {

      Deck deck = new Deck();
      Player player1 = new Player("");
      Player player2 = new Player("");

      deck.dealCards(player1, player2);
      Assert.assertTrue(deck.getCards().size() == 26);
      Assert.assertTrue(player1.getCards().size() == 13);
      Assert.assertTrue(player2.getCards().size() == 13);
   }
}
