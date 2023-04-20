package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void addition() {
        int a = 5, b = 8;
        int expected = a + b;
        int actual = Main.addition(a,b);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void addition1() {
        int a = 5, b = 8;
        String expected = "Summe: " + (a + b);
        String actual = Main.addition1(a,b);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isGreaterThan() {
        int comparable = 100;
        int a = 5, b = 101;
        boolean actual = Main.isGreaterThan(a, b, comparable);
        assertTrue(actual);

    }

    @Test
    void fizzbuzz() {
//      Normalfall
        int input = 1;
        String expected = "" + input;

        String actual = Main.fizzbuzz(input);

        assertEquals(expected, actual);

//      die Zahl durch 3 und 5 teilbar
        int input1 = 15;
        String expected1 = "fizzbuzz";

        String actual1 = Main.fizzbuzz(input1);

        assertEquals(expected1, actual1);

//      die Zahl durch 3 teilbar
        int input2 = 3;
        String expected2 = "fizz";

        String actual2 = Main.fizzbuzz(input2);

        assertEquals(expected2, actual2);

//      die Zahl durch 5 teilbar
        int input3 = 5;
        String expected3 = "buzz";

        String actual3 = Main.fizzbuzz(input3);

        assertEquals(expected3, actual3);
    }

    @Test
    void smallerThanZero() {
        int input = 100;
        boolean actual = Main.smallerThanZero(input);
        assertFalse(actual);
    }

    @Test
    void sumSquareOrSubstract() {
//        case 1
        int input1_case1 = 5, input2_case1 = 3;
        boolean flag_case1 = false;

        int expected = input1_case1 + input2_case1;

        int actual = Main.sumSquareOrSubstract(input1_case1, input2_case1, flag_case1);

        assertEquals(expected, actual);

//        case 2
        int input1_case2 = 2, input2_case2 = 8;
        boolean flag_case2 = false;

        int expected2 = input1_case2 * input2_case2;

        int actual2 = Main.sumSquareOrSubstract(input1_case2, input2_case2, flag_case2);

        assertEquals(expected2, actual2);

        //        case 3
        int input1_case3 = 5, input2_case3 = 3;
        boolean flag_case3 = true;

        int expected3 = input2_case3 - input1_case3;

        int actual3 = Main.sumSquareOrSubstract(input1_case3, input2_case3, flag_case3);

        assertEquals(expected3, actual3);

    }
}