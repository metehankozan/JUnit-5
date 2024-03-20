package dev.metehan;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running MathUtils")
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("add method")
    @Tag("Math")
    class AddTest {
        @Test
        @DisplayName("for two positive numbers")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1), "should return the right sum");
        }

        @Test
        @DisplayName("for two negative numbers")
        void testAddNegative() {
            int expected = -2;
            int actual = mathUtils.add(-1, -1);
            assertEquals(expected, actual, () -> "should have returned " + expected + " but returned " + actual);
        }
    }

    @Test
    @DisplayName("multiply method")
    @Tag("Math")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2)),
                () -> assertEquals(0, mathUtils.multiply(2, 0)),
                () -> assertEquals(-2, mathUtils.multiply(2, -1))
        );
    }

    @Test
    @DisplayName("divide method")
    @Tag("Math")
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "should throw exception when divisor is zero");
    }

    @RepeatedTest(3)
    @Tag("Circle")
    void testCalculateCircleArea(RepetitionInfo repetitionInfo) {
        switch (repetitionInfo.getCurrentRepetition()) {
            case 1:
                assertEquals((Math.PI * Math.pow(10, 2)), mathUtils.calculateCircleArea(10),
                        "should return circle area");
                break;
            case 2:
                assertEquals((Math.PI * Math.pow(20, 2)), mathUtils.calculateCircleArea(20),
                        "should return circle area");
                break;
            case 3:
                assertEquals((Math.PI * Math.pow(30, 2)), mathUtils.calculateCircleArea(30),
                        "should return circle area");
                break;
            default:
                fail();
        }
    }

}