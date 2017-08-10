package com.oop;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDivide {

    @Test
    public void testDivde6By3() throws InvalidOperationException{
        Divide divide = new Divide();
        assertEquals(2,divide.doOperation(6,3));
        assertEquals(-2,divide.doOperation(6,-3));
    }

    @Test
    public void testDivideSomeLongNumber() throws InvalidOperationException {
        Divide divide = new Divide();
        assertEquals(1000000, divide.doOperation(12222000000l,12222l));
    }

    @Test
    public void testDivideBy0() throws InvalidOperationException {
        Divide divide = new Divide();
        assertEquals(Double.POSITIVE_INFINITY,divide.doOperation(1,0));
    }

    @Test
    public void testDivideByZeroWithDifferentValuesShouldBeSame() throws InvalidOperationException{
        Divide divide = new Divide();
        assertEquals(Integer.MIN_VALUE,divide.doOperation(1,0));
        assertEquals(Integer.MIN_VALUE,divide.doOperation(4,0));
    }
}
