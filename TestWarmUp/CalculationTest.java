import OCAWarmUp.Calculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
   @Test
   public void itShouldReturn6desksFor22People(){
      Calculation calc1 = new Calculation();
       calc1.setNumberOfPeople(22);
      assertEquals(6,calc1.getDesks());
   }
   @Test
    public void itShouldReturn0desksForMoreThan50People(){
        Calculation calc1 = new Calculation();
        calc1.setNumberOfPeople(55);
        assertEquals(0,calc1.getDesks());
    }
}
