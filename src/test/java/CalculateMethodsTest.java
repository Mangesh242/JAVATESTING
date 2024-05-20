import org.example.CalculateMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculateMethodsTest {
//    private CalculateMethods calculateMethods = new CalculateMethods();
    private CalculateMethods calculateMethods;

    @BeforeEach
    public void initTest(){
        calculateMethods=new CalculateMethods();
    }

    @Test
    public void testDivide(){
        Assertions.assertEquals(10,calculateMethods.divide(100,10));
    }

    @Test
    public void testDivideByZero(){
        Assertions.assertThrows(ArithmeticException.class,()->calculateMethods.divide(100,0));
    }

    @Test
    public void testOverflow(){
        Assertions.assertEquals(100,calculateMethods.divide(1000,10));
    }
}
