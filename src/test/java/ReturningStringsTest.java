import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class ReturningStringsTest {

    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }

}