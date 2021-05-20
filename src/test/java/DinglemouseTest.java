import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class DinglemouseTest {
    @Test
    public void test() {
        assertEquals(new Dinglemouse("Clint", "Eastwood").getFullName(), "Clint Eastwood");
    }

}