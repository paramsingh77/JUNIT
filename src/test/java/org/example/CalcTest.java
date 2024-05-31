package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;
class CalcTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("Before Class");
    }

    @BeforeEach
    void printStar(){
        System.out.println("************************");
        System.out.println("Test Performing");
    }
    @Test
    void add() {
        Calc calc = new Calc();
        int ans = calc.add(1, 2);
        assertTrue(ans==3);
        System.out.println("True");
    }

    @Test
    public void checkSize(){
        int []arr = {1,2,3,4};
        int []expected = {1,2,3,4};

        assertArrayEquals(expected, arr);
        System.out.println("True");
    }

    @AfterAll
    static void printEnd(){
        System.out.println("************************");
        System.out.println("Test End");
    }
}