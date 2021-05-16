import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ReverseWordsWithListTest {
    @Test
    public void testSomething() {
        assertEquals(ReverseWords.reverseWords("I like eating"), "eating like I");
        assertEquals(ReverseWords.reverseWords("I like flying"), "flying like I");
        assertEquals(ReverseWords.reverseWords("The world is nice"), "nice is world The");
    }
}