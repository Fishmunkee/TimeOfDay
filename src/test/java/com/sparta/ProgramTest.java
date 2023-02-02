package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    @DisplayName("My first test")
    public void firstTest(){
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, greeting should return Good Evening")
    public void given21_Greeting_ReturnsGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Given a time between 5 and 12, greeting returns good morning")
    public void GivenTimeBetween5And12_GreetingReturnsGoodMorning(int time) {
        String expected = "Good morning!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 25})
    @DisplayName("Given a time outside of the boundaries, greeting returns Error invalid selection")
    public void GivenTimeOutsideOfBoundaries_GreetingReturnsInvalidSelection(int time) {
        String expected = "Error: Invalid selection!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4})
    @DisplayName("Given a time between 0 and 4, greeting returns Go back to sleep!")
    public void GivenTimeBetween0And4_GreetingReturnsGoBackToSleep(int time) {
        String expected = "Go back to sleep!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }
}