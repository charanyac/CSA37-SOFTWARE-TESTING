import static org.junit.Assert.*;
import org.junit.Test;

public class DaysConverterTest {

    @Test
    public void testValidInput() {
        // Testing valid input
        assertEquals("Years: 0, Weeks: 0, Days: 0", DaysConverter.convertDays(0));
        assertEquals("Years: 1, Weeks: 0, Days: 0", DaysConverter.convertDays(365));
        assertEquals("Years: 2, Weeks: 0, Days: 0", DaysConverter.convertDays(730));
        assertEquals("Years: 0, Weeks: 1, Days: 0", DaysConverter.convertDays(7));
        assertEquals("Years: 1, Weeks: 0, Days: 1", DaysConverter.convertDays(366));
        assertEquals("Years: 3, Weeks: 4, Days: 5", DaysConverter.convertDays(1100));
    }

    @Test
    public void testNegativeInput() {
        // Testing negative input
        assertEquals("Please enter a non-negative number of days.", DaysConverter.convertDays(-10));
    }
}
