import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FeastOfManyBeastsTest {
    @Test
    public void fixedTest() {
        assertTrue(FeastOfManyBeasts.feast("great blue heron","garlic nann"));
        assertTrue(FeastOfManyBeasts.feast("chickadee","chocolate cake"));
        assertFalse(FeastOfManyBeasts.feast("brown bear","bear claw"));
    }

}