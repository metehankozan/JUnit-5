package dev.metehan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
    class AddTest {
        @Test
        @DisplayName("for two positive numbers")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1), "should return the right sum");
        }

        @Test
        @DisplayName("for two negative numbers")
        void testAddNegative() {
            assertEquals(-2, mathUtils.add(-1, -1), "should return the right sum");
        }
    }

    @Test
    @DisplayName("multiply method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2,2)),
                () -> assertEquals(0, mathUtils.multiply(2,0)),
                () -> assertEquals(-2, mathUtils.multiply(2,-1))
        );
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),
                "should throw exception when divisor is zero");
    }

    @Test
    void testCalculateCircleArea() {
        assertEquals((Math.PI * Math.pow(10, 2)), mathUtils.calculateCircleArea(10),
                "should return circle area");
    }

}