package com.tts.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    // these variables should be used in every test
    // therefore they are global

    int x = 4;
    int y = 3;

    //

    @BeforeEach
    void setUp() {
        System.out.println("Running test!");
    }

    @Test
    void echoBack() {
        int expected = 5;
        int actual = 5;
        assertEquals( 5, actual);
    }
    @Test
    void echoBackTest(){
        String expected = "hello";
        assertEquals(expected, Utility.echoBack( "hello"));
    }
    @Test
    void addTest(){
        int expected = x + y;
        assertEquals(expected, Utility.add(x,y));
    }

    @Test
    void sampleTest(){
//        fail("Not yet implemented,");
//        assertTrue( true);

    }
}