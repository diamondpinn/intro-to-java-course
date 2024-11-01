package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Year Test Suite")
public class YearTest {

    private final Year yearChecker = new Year();

    @Test
    @DisplayName("Test leap years")
    void testLeapYears() {
        assertTrue(yearChecker.isLeap(2000));
        assertTrue(yearChecker.isLeap(2004));
        assertTrue(yearChecker.isLeap(2008));
        assertTrue(yearChecker.isLeap(2012));
        assertTrue(yearChecker.isLeap(2400));
    }

    @Test
    @DisplayName("Test non-leap years")
    void testNonLeapYears() {
        assertFalse(yearChecker.isLeap(1700));
        assertFalse(yearChecker.isLeap(1800));
        assertFalse(yearChecker.isLeap(1900));
        assertFalse(yearChecker.isLeap(2001));
        assertFalse(yearChecker.isLeap(2002));
        assertFalse(yearChecker.isLeap(2003));
        assertFalse(yearChecker.isLeap(2005));
        assertFalse(yearChecker.isLeap(2006));
        assertFalse(yearChecker.isLeap(2007));
        assertFalse(yearChecker.isLeap(2100));
    }
}
