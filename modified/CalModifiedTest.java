package Assignment1.modified;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalModifiedTest {

    // Same day in the same month, should be 0 days
    @Test
    public void testSameDaysInSameMonth() {
        int numDays = CalModified.cal(3, 1, 3, 1, 2023);
        assertEquals(0, numDays);
    }

    // Different day in the same month, should be 30 days
    @Test
    public void testDifferentDaysInSameMonth() {
        int numDays = CalModified.cal(3, 1, 3, 31, 2023);
        assertEquals(30, numDays);
    }

    // Different day in Different month, should be 60 days

    @Test
    public void testDifferentDaysInDifferentMonth() {
        int numDays = CalModified.cal(3, 1, 4, 30, 2023);
        assertEquals(60, numDays);
    }

    // Non-leap year, days between months
    @Test
    public void testWhenYearIsNotDivisibleBy4AndDifferentMonths() {
        int numDays = CalModified.cal(1, 31, 4, 2, 2023);
        assertEquals(61, numDays);
    }

    // Leap year, days between months
    @Test
    public void testForLeapYearAndDifferentMonths() {
        int numDays = CalModified.cal(1, 31, 4, 2, 2024);
        assertEquals(62, numDays);
    }

    // Year divisible by 100 but not 400, non-leap year
    @Test
    public void testForYearDivisibleBy100AndNotBy400AndDifferentMonths() {
        int numDays = CalModified.cal(1, 31, 4, 2, 300);
        assertEquals(61, numDays);
    }

    // Year divisible by 400 and different months, leap year
    @Test
    public void testForYearDivisibleBy400AndDifferentMonths() {
        int numDays = CalModified.cal(1, 31, 4, 2, 2400);
        assertEquals(62, numDays);
    }

    // August to Different Month
    @Test
    public void testAugToDifferentMonth() {
        int numDays = CalModified.cal(8, 1, 9, 1, 2023);
        assertEquals(31, numDays);
    }

    // Leap year to Different Month
    @Test
    public void testLeapYearMonthToDifferentMonth() {
        int numDays = CalModified.cal(2, 1, 3, 1, 2024);
        assertEquals(29, numDays);
    }

    // Non-leap year to Different Month
    @Test
    public void testNonLeapYearMonthToDifferentMonth() {
        int numDays = CalModified.cal(2, 1, 3, 1, 2023);
        assertEquals(28, numDays);
    }

    // crossing February from a Leap Year (Feb 28 to March 1 in a leap year)
    @Test
    public void testFebToMarchInLeapYear() {
        int numDays = CalModified.cal(2, 28, 3, 1, 2024);
        assertEquals(2, numDays);
    }

    // crossing February from a Non-Leap Year (Feb 28 to March 1 in a non-leap year)
    @Test
    public void testFebToMarchInNonLeapYear() {
        int numDays = CalModified.cal(2, 28, 3, 1, 2023);
        assertEquals(1, numDays);
    }

    // boundaries within February (1st to 28th in non-leap year)
    @Test
    public void testBoundaryDaysInFebNonLeapYear() {
        int numDays = CalModified.cal(2, 1, 2, 28, 2023);
        assertEquals(27, numDays);
    }

    // boundaries within February (1st to 29th in leap year)
    @Test
    public void testBoundaryDaysInFebLeapYear() {
        int numDays = CalModified.cal(2, 1, 2, 29, 2024);
        assertEquals(28, numDays);
    }

    // From December 31st to January 1st (same year boundary)
    @Test
    public void testDecemberToJanuarySameYear() {
        int numDays = CalModified.cal(12, 31, 12, 31, 2023);
        assertEquals(0, numDays);
    }

    // Maximum days in December (December 1 to December 31)
    @Test
    public void testMaxDaysInDecember() {
        int numDays = CalModified.cal(12, 1, 12, 31, 2023);
        assertEquals(30, numDays);
    }

    // February 29th in a Leap Year to March 1st
    @Test
    public void testFeb29ToMarch1LeapYear() {
        int numDays = CalModified.cal(2, 29, 3, 1, 2024);
        assertEquals(1, numDays);
    }

    // February 28th in Non-Leap Year to March 31st
    @Test
    public void testFeb28ToMarch31NonLeapYear() {
        int numDays = CalModified.cal(2, 28, 3, 31, 2023);
        assertEquals(31, numDays);
    }

    // February 29th in a Leap Year to March 31st
    @Test
    public void testFeb29ToMarch31LeapYear() {
        int numDays = CalModified.cal(2, 29, 3, 31, 2024);
        assertEquals(31, numDays);
    }

    // Crossing December to January (End of year scenario, edge case, same year)
    @Test
    public void testDecemberToJanuary() {
        int numDays = CalModified.cal(12, 1, 12, 31, 2023);
        assertEquals(30, numDays);
    }

}
