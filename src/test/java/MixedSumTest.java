import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.*;

public class MixedSumTest {
    MixedSum mixedSum = new MixedSum();

    @Test
    public void test_1() {
        assertEquals(mixedSum.sum(Arrays.asList(5,"5")),10);
    }

    @Test
    public void test_2() {
        assertEquals(mixedSum.sum(Arrays.asList(9, 3, "7", "3")), 22);
    }

    @Test
    public void test_3() {
        assertEquals(mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)), 42);
    }

    @Test
    public void test_4() {
        assertEquals(mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")), 41);
    }

    @Test
    public void test_5() {
        assertEquals(mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")), 45);
    }

}