public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
FactorialCalculator.test:
import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(720, FactorialCalculator.calculateFactorial(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculateFactorial(-5);
    }
}
