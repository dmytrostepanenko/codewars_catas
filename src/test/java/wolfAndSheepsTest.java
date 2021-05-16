import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class wolfAndSheepsTest {
    @Test
    public void testSomething() {
        assertEquals(WolfAndSheeps.warnTheSheep(
                new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}),
                "Oi! Sheep number 2! You are about to be eaten by a wolf!");
        assertEquals(
                WolfAndSheeps.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}),
                "Oi! Sheep number 5! You are about to be eaten by a wolf!");
        assertEquals(WolfAndSheeps.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}),
                "Oi! Sheep number 6! You are about to be eaten by a wolf!");
        assertEquals(WolfAndSheeps.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}),
                "Oi! Sheep number 1! You are about to be eaten by a wolf!");
        assertEquals(WolfAndSheeps.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}),
                "Pls go away and stop eating my sheep");
    }
}