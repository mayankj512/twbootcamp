package com.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntTest {


    @Test
    public void test1() {
        assertEquals(212,StringToInt.parse("212"));
    }

    @Test(expected = NumberFormatException.class)
    public void test2() {
        StringToInt.parse("ABC");
    }
}
