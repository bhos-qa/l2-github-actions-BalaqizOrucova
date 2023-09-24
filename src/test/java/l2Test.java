import org.example.l2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class l2Test {
    @Test
    public void testAdd() {
        l2 myClass = new l2();
        int result = myClass.add(4, 5);
        assertEquals(20, result);
    }
}

