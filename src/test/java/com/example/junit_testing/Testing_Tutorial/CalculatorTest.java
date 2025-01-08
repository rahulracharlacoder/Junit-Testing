package com.example.junit_testing.Testing_Tutorial;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator c = new Calculator();

    @BeforeAll
    public static void beforeAllTestCases(){
        System.out.println("This before all the cases");
    }

    @AfterAll
    public static void afterAllTestCases(){
        System.out.println("This after all the cases");
    }

    @BeforeEach
    public void beforeTestCases(){
        System.out.println("This is before every test case");
    }

    @AfterEach
    public void afterTestCase(){
        System.out.println("This is after every test case");
    }

    @Test
    @DisplayName("Test Case for ADD")
    public void test_add_numbers_are_positive_numbers() {
        System.out.println("Test 1");
        int x = 5;
        int y = 10;
        int expected = 15;
        int actual = c.add(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_sub_numbers_are_positive_numbers() {
        System.out.println("Test 2");
        int x = 10;
        int y = 5;
        int expected = 5;
        int actual = c.subtract(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_isEven(){
        System.out.println("Test 3");
        int x = 10;
        boolean actual = c.isEven(x);
        Assertions.assertTrue(actual);
    }

    @Test
    public void test_isOdd(){
        System.out.println("Test 4");
        int x = 11;
        boolean actual = c.isEven(x);
        Assertions.assertFalse(actual);
    }
}
