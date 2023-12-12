import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArmstrongNumberTest {
    @Test
    public void testIsArmstrong() {
        assertTrue(Armstrongnumber.isArmstrong(153)); 
        
    }
    @Test
     public void testIsnotArmstrong() {
    	assertFalse(Armstrongnumber.isArmstrong(151));
    	
    }
}
