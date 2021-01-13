package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

    Watch myWatch = new Watch();

    String expected;
    String actual;

    @Test

    void getFaceTest() {
        expected = "Mickey Mouse";
        actual = myWatch.getFace();

//        assertEquals(expected, actual);
        assertEquals(0, expected.compareTo(actual));
    }

    @Test
    void getBandTest() {
        myWatch.setBand("plastic");
        expected = "leather";
        actual = myWatch.getBand();

        assertEquals( 0, expected.compareTo(actual));
    }

}