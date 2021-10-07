package org.example.lesson4HW;

import org.junit.Test;

import static org.example.lesson4.Triangle.calculateTriangleSquare;

public class TriangleSquareCalculationTest {

@Test

    void positiveSquareCalculationTest() {
    double result = calculateTriangleSquare(a: 2, b: 2, c: 2);
Assertion.assertEquals(expected: 3, result);


}

}
