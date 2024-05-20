import org.example.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld obj = new HelloWorld();
        assertEquals("Hello World!",obj.Helllo());
    }

}
