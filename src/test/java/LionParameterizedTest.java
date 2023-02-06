import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean result;

    public LionParameterizedTest(String sex, boolean result){
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Неизвестный пол", false}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void doesHaveManeMaleTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean hasManeActual = lion.doesHaveMane();
        Assert.assertEquals(true , hasManeActual);
    }
}
