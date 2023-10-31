import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnitDemo {

    @Test
    void testAssertEqualsString() {
        String str1 = "Test1";
        String str2 = "Test1";

        assertEquals(str1, str2);
    }

    @Test
    void testAssertEqualsInt() {
        assertEquals(1, 1);
    }

    @Test
    void testAssertBoolean() {
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    void testAssertThrows() {
        SampleClass sampleClass = new SampleClass();
        assertThrows(RuntimeException.class, ()-> sampleClass.throwsException(true));
    }


    static class SampleClass {
        void throwsException(boolean shouldThrow) {
            if (shouldThrow) {
                throw new RuntimeException();
            }
        }
    }


}
