package hamcrest;

import org.junit.jupiter.api.Test;
import productcostcalculator.Order;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HamcrestDemoTest {

    private static final String EXPECTED_STRING = "foo";

    private static final String ACTUAL_STRING = "FOO";

    private static final Order EXPECTED_ORDER = Order.of("Apple", 2);

    private static final Order ACTUAL_ORDER = Order.of("Apple", 2);

    private static final List<String> PRODUCTS =
            List.of("Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach");

    @Test
    void stringsShouldBeEqualUsingAssertTrueOfJUnit() {
        assertTrue(EXPECTED_STRING.equalsIgnoreCase(ACTUAL_STRING));
    }

    @Test
    void stringsShouldBeEqualUsingAssertEqualOfJUnit() {
        assertEquals(EXPECTED_STRING.toLowerCase(), ACTUAL_STRING.toLowerCase());
    }

    @Test
    void stringsShouldBeEqualUsingAssertThatOfHamcrest() {
        assertThat(ACTUAL_STRING, equalToIgnoringCase(EXPECTED_STRING));
    }

    @Test
    void stringShouldBeNullUsingAssertNullOfJUnit() {
        String actualString = null;
        assertNull(actualString);
    }

    @Test
    void stringShouldBeNullUsingAssertThatOfHamcrest() {
        String actualString = null;
        assertThat(actualString, is(nullValue()));
    }

    @Test
    void stringShouldBeNullOrEmptyUsingAssertTrueOfJUnit() {
        String[] blankStrings = new String[] {null, ""};
        for (String blankString : blankStrings) {
            assertTrue(blankString == null || blankString.isEmpty());
        }
    }

    @Test
    void stringShouldBeNullOrEmptyUsingAssertThatOfHamcrest() {
        String[] blankStrings = new String[] {null, ""};
        for (String blankString : blankStrings) {
            assertThat(blankString, is(emptyOrNullString()));
        }
    }

    @Test
    void ordersShouldBeEqualUsingJUnit() {
        // assertEquals(EXPECTED_ORDER, ACTUAL_ORDER); // try this and the test will fail

        assertEquals(EXPECTED_ORDER.getProduct(), ACTUAL_ORDER.getProduct());
        assertEquals(EXPECTED_ORDER.getQuantity(), ACTUAL_ORDER.getQuantity());
    }

    @Test
    void ordersShouldBeEqualUsingHamcrest() {
        assertThat(ACTUAL_ORDER, samePropertyValuesAs(EXPECTED_ORDER));
    }

    @Test
    void numberOfProductsShouldBe8UsingJUnit() {
        assertEquals(8, PRODUCTS.size());
    }

    @Test
    void numberOfProductsShouldBe8UsingHamcrest() {
        assertThat(PRODUCTS, hasSize(8));
    }

    @Test
    void productsShouldContainElementsInOrderUsingJUnit() {
        List<String> actualProducts =
                List.of("Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach");

        // this will fail
    /*
    List<String> actualProducts =
            List.of("Apple", "Mango", "Orange", "Banana", "Prunes", "Lychee", "Peach", "Strawberry");*/

        assertEquals(PRODUCTS, actualProducts);
    }

    @Test
    void productsShouldContainElementsInOrderUsingHamcrest() {
        List<String> actualProducts =
                List.of("Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach");

        // this will fail
    /*
    List<String> actualProducts =
            List.of("Apple", "Mango", "Orange", "Banana", "Prunes", "Lychee", "Peach", "Strawberry");*/

        assertThat(
                actualProducts,
                contains("Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach"));
    }

    @Test
    void productsShouldContainElementsInAnyOrderUsingJUnit() {
        Set<String> expectedProducts =
                Set.of("Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach");

        List<String> actualProducts =
                List.of("Apple", "Mango", "Orange", "Banana", "Prunes", "Lychee", "Peach", "Strawberry");

        assertEquals(8, actualProducts.size());

        for (String product : actualProducts) {
            assertTrue(expectedProducts.contains(product));
        }
    }

    @Test
    void productsShouldContainElementsInAnyOrderUsingHamcrest() {
        List<String> actualProducts =
                List.of("Apple", "Mango", "Orange", "Banana", "Prunes", "Lychee", "Peach", "Strawberry");

        assertThat(
                actualProducts,
                containsInAnyOrder(
                        "Apple", "Mango", "Orange", "Strawberry", "Banana", "Prunes", "Lychee", "Peach"));
    }

    @Test
    void mapShouldHaveProductAsKeyUsingJUnit() {
        final String PRODUCT_KEY = "Product";
        Map<String, String> map = Map.of("Product", "Apple");

        assertTrue(map.containsKey(PRODUCT_KEY));
    }

    @Test
    void mapShouldHaveAppleAsKeyUsingHamcrest() {
        final String PRODUCT_KEY = "Product";
        Map<String, String> map = Map.of("Product", "Apple");

        assertThat(map, hasKey(PRODUCT_KEY));
    }

    @Test
    void mapShouldHaveEntryForProductUsingJunit() {
        final String PRODUCT_KEY = "Product";
        Map<String, String> map = Map.of("Product", "Apple");

        assertEquals("Apple", map.get(PRODUCT_KEY));
    }

    @Test
    void mapShouldHaveEntryForProductUsingHamcrest() {
        final String PRODUCT_KEY = "Product";
        Map<String, String> map = Map.of("Product", "Apple");

        assertThat(map, hasEntry(PRODUCT_KEY, "Apple"));
    }

    @Test
    void numberShouldBeGreaterThan5UsingJunit() {
        final int referenceNumber = 5;
        final int actualNumber = 6;

        assertTrue(actualNumber > referenceNumber);
    }

    @Test
    void numberShouldBeGreaterThan5UsingHamcrest() {
        final int referenceNumber = 5;
        final int actualNumber = 6;

        assertThat(actualNumber, greaterThan(referenceNumber));
    }

    @Test
    void doubleIsCloseTo1WithPoint5DeltaUsingJUnit() {
        final double actualDouble = 1.2;

        assertTrue(actualDouble <= 1.5);
        assertTrue(actualDouble >= 0.5);
    }

    @Test
    void doubleIsCloseTo1WithPoint5DeltaUsingHamcrest() {
        final double actualDouble = 1.2;

        assertThat(actualDouble, closeTo(1, .5));
    }

    @Test
    void shouldBePositiveIntegerUsingCustomMatcher() {
        final int actualInteger = 1;

        assertThat(actualInteger, IsPositiveIntegerMatcher.isAPositiveInteger());
    }

    @Test
    void ordersShouldBeEqualUsingCustomMatcher() {
        Order expectedOrder = Order.of("Apple", 3);
        Order actualOrder = Order.of("Apple", 3);

        assertThat(actualOrder, OrderMatcher.isEqualToOrder(expectedOrder));
    }
}
