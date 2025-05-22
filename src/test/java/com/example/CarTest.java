package com.example;

import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testName() {
        assertTrue(Car.isCar("carblue"));
        assertFalse(Car.isCar("blue"));
    }
}