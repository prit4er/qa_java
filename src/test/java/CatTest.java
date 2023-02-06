import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    List<String> CATFOOD = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void getSounds() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception{
        Assert.assertEquals(CATFOOD, cat.getFood());
    }
}