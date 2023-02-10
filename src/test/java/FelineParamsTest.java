import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamsTest {

    @Parameterized.Parameter()
    public int kittensCount;
    @Parameterized.Parameter(1)
    public int expectedCount;

    @Parameterized.Parameters(name = " Сколько котят: {0}, обнаружено: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 2}
        };
    }

    @Test
    public void testGetKittensWithArgumentsReturnsValidCount() {
        Feline feline = new Feline();
        assertEquals("getKitten вернет количество котят", expectedCount, feline.getKittens(kittensCount));
    }
}