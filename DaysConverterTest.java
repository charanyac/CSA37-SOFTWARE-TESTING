import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DaysConverterTest {

    @Test
    public void testConvertDays() {
        // Given
        int numberOfDays = 1000;

        // When
        DaysConversionResult result = DaysConverter.convertDays(numberOfDays);

        // Then
        assertEquals(2, result.getYears());
        assertEquals(38, result.getWeeks());
        assertEquals(4, result.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDaysWithNegativeInput() {
        // Given
        int numberOfDays = -10;

        // When
        DaysConverter.convertDays(numberOfDays);

        // Then: IllegalArgumentException should be thrown
    }
}