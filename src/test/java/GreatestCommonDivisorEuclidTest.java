import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GreatestCommonDivisorEuclidTest {
    @Test
    public void testGcd() {
        assertEquals(GreatestCommonDivisor.compute(30,12), 6);
        assertEquals(GreatestCommonDivisor.compute(8,9),1);
        assertEquals(GreatestCommonDivisor.compute(1,1),1);
    }
}