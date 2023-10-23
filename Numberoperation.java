public class NumberOperations {
    public static double calculateSquare(double number) {
        return number * number;
    }

    public static double calculateCube(double number) {
        return number * number * number;
    }
}
NumberOpertionTest.java
  import static org.junit.Assert.*;
import org.junit.Test;

public class NumberOperationsTest {

    @Test
    public void testSquareOfPositiveNumber() {
        double result = NumberOperations.calculateSquare(5.0);
        assertEquals(25.0, result, 0.0001);
    }

    @Test
    public void testSquareOfZero() {
        double result = NumberOperations.calculateSquare(0.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSquareOfNegativeNumber() {
        double result = NumberOperations.calculateSquare(-4.0);
        assertEquals(16.0, result, 0.0001);
    }

    @Test
    public void testCubeOfPositiveNumber() {
        double result = NumberOperations.calculateCube(3.0);
        assertEquals(27.0, result, 0.0001);
    }

    @Test
    public void testCubeOfZero() {
        double result = NumberOperations.calculateCube(0.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testCubeOfNegativeNumber() {
        double result = NumberOperations.calculateCube(-2.0);
        assertEquals(-8.0, result, 0.0001);
    }
}
