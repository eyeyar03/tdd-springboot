package com.cognizant.masterclass.tddspringboot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitDemo {

    @Test
    void test() {
        System.out.println("Test is running");
    }

    @Test
    void testAssertEquals() {
        String str1 = "Test1";
        String str2 = "Test1";

        assertEquals(str1, str2);
    }

    @Test
    void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    void testAssertThrows() {
        SampleClass sc = new SampleClass();
        assertThrows(Exception.class, () -> sc.throwException(true));
    }

    static class SampleClass {
        void throwException(Boolean shouldThrowException) throws Exception {
            if(shouldThrowException)
                throw new Exception();
        }
    }
}
