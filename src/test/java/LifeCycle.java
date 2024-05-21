import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifeCycle {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @Test
    public void deposit(){

    }
}
