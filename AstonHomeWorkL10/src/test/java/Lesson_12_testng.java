import org.example.FindFactorial;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Lesson_12_testng {
    @Test
    public void testCalculateFactorial() {
        FindFactorial findFactorial = new FindFactorial();

        Assert.assertEquals(findFactorial.calculateFactorial(0), 1);
        Assert.assertEquals(findFactorial.calculateFactorial(1), 1);
        Assert.assertEquals(findFactorial.calculateFactorial(5), 120);
        Assert.assertEquals(findFactorial.calculateFactorial(10), 3628800);
        Assert.assertEquals(findFactorial.calculateFactorial(4), 24);
    }
}