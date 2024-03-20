package dev.metehan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "the add method should add 2 numbers");
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