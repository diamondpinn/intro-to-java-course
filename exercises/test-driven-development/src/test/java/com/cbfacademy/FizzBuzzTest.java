package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "FizzBuzz Test Suite")
public class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.get(1), is("1"));
        assertThat(fizzBuzz.get(2), is("2"));
        assertThat(fizzBuzz.get(3), is("Fizz"));
        assertThat(fizzBuzz.get(5), is("Buzz"));
        assertThat(fizzBuzz.get(15), is("FizzBuzz"));
    }
}
