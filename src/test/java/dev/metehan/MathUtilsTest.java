package dev.metehan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "the add method should add 2 numbers");
    }

    @Test
    void testCalculateCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals((Math.PI * Math.pow(10, 2)), mathUtils.calculateCircleArea(10),
                "should return circle area");
    }

}