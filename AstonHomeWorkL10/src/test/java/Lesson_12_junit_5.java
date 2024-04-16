import org.example.FindFactorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson_12_junit_5 {
    @Test
    public void testCalculateFactorial() {
        FindFactorial findFactorial = new FindFactorial();

        assertEquals(1, findFactorial.calculateFactorial(0));
        assertEquals(1, findFactorial.calculateFactorial(1));
        assertEquals(120, findFactorial.calculateFactorial(5));
        assertEquals(3628800, findFactorial.calculateFactorial(10));
        assertEquals(24, findFactorial.calculateFactorial(4));
    }
}