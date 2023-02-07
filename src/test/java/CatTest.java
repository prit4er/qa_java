import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    final static List<String> CATFOOD = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void TestGetSounds() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void TestGetFood() throws Exception{
        Assert.assertEquals(CATFOOD, cat.getFood());
    }
}