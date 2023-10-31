import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitDemo {

    @Test
    void testAssertEqual() {
        String str1 = "Test1";
        String str2 = "Test1";

        assertEquals(1,1);
    }

    @Test
    void testAssertBoolean() {
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    void testAssertThrows(){
        SampleClass sampleClass = new SampleClass();

        assertThrows(RuntimeException.class, () -> sampleClass.throwException(true));

    }

    static class SampleClass{
        void throwException(boolean shouldThrow){
            if(shouldThrow){
                throw new RuntimeException();
            }
        }
    }
}
