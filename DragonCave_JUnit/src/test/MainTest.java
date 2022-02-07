import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void runTest (){
assertEquals(5, main.runTest(), "This test failed");
    }
    @AfterEach
    void tearDown() {
    }
}
