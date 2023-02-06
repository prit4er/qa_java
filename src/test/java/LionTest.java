import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensLionReturn1() throws Exception{
        Lion lion = new Lion("Самка", feline);
        int result = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(lion.getKittens(), result);
    }
    @Mock
    Animal animal;

    @Test
    public void lionEatsMeatTrue() throws Exception{
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List actualResult = animal.getFood("Хищник");
        List expectedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Mock
    Lion lion;

    @Test
    public void countLionIsOne1() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        int expectedLionCount = 1;
        int actualLionCount = lion.getKittens();
        assertEquals(expectedLionCount, actualLionCount);
    }


}
