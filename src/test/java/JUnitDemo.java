import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JUnitDemo {

  @Test
  void testAssertEqualsForString() {
    String expectedString = "Test";
    String actualString = "String";

    assertEquals(expectedString, actualString);
  }

  @Test
  void testAssertEqualsInteger() {
    int expectedInteger = 1;
    int actualInteger = 1;

    assertEquals(expectedInteger, actualInteger);
  }

  @Test
  void testAssertBoolean() {
    boolean expectedBoolean = true;

    assertTrue(expectedBoolean);

    expectedBoolean = false;
    assertFalse(expectedBoolean);
  }

  @Test
  void testAssertThrows() {
    AClassThatThrows aClassThatThrows = new AClassThatThrows();

    assertThrows(
        RuntimeException.class, () -> aClassThatThrows.doSomethingThatCouldPossibleThrow(true));
  }

  static class AClassThatThrows {

    void doSomethingThatCouldPossibleThrow(boolean shouldThrow) {
      if (shouldThrow) {
        throw new RuntimeException();
      }
    }
  }
}
