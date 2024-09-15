package Assignment1.normal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCalParameterized {
    @ParameterizedTest
    @CsvSource({
            "3, 1, 3, 1, 2023, 0",
            "3, 1, 3, 31, 2023, 30",
            "3, 1, 4, 30, 2023, 60",
            "1, 31, 4, 2, 2023, 61",
            "1, 31, 4, 2, 2024, 62",
            "1, 31, 4, 2, 300, 61",
            "1, 31, 4, 2, 2400, 62",
            "8, 1, 9, 1, 2023, 31",
            "2, 1, 3, 1, 2024, 29",
            "2, 1, 3, 1, 2023, 28",
            "2, 28, 3, 1, 2024, 2",
            "2, 28, 3, 1, 2023, 1",
            "2, 1, 2, 28, 2023, 27",
            "2, 1, 2, 29, 2024, 28",
            "12, 31, 12, 31, 2023, 0",
            "12, 1, 12, 31, 2023, 30",
            "2, 29, 3, 1, 2024, 1",
            "2, 28, 3, 31, 2023, 31",
            "2, 29, 3, 31, 2024, 31",
            "12, 1, 12, 31, 2023, 30"
    })
    void testCal(int month1, int day1, int month2, int day2, int year, int expectedDays) {
        int numDays = Cal.cal(month1, day1, month2, day2, year);
        assertEquals(expectedDays, numDays);
    }
}
