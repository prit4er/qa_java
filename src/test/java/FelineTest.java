import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FelineTest {

    List<String> FELINEFOOD = Arrays.asList("Животные", "Птицы", "Рыба");
    Feline feline = new Feline();
    @Test
    public void eatMeat() throws Exception {
        Assert.assertEquals(FELINEFOOD, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        int kittensCount = feline.getKittens();
        Assert.assertEquals(kittensCount, feline.getKittens());
    }
}