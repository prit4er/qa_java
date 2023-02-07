import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FelineTest {

    final static List<String> FELINEFOOD = Arrays.asList("Животные", "Птицы", "Рыба");
    Feline feline = new Feline();
    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(FELINEFOOD, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensOne() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensTwo() {
        int kittensCount = feline.getKittens();
        Assert.assertEquals(kittensCount, feline.getKittens());
    }
}