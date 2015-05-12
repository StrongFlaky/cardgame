import org.junit.Assert;
import org.junit.Test;

public class CardTest {

   @Test
   public void verifyThatTheCompareMethodWorks() {

      Card aceOfHearts = new Card(Rank.ace, Suite.hearts);
      Card kingOfDiamonds = new Card(Rank.king, Suite.diamonds);

      Assert.assertTrue(aceOfHearts.compare(kingOfDiamonds) < 0);
   }
}
