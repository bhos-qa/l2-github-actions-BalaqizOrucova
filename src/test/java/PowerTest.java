import org.example.Power;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {
    @Test
    public void testPower() {
        Power mySimpleClass = new Power();
        int result = mySimpleClass.power(4, 5);
        assertEquals(20, result);
    }
}
