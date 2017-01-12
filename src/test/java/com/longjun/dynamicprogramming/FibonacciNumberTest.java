package com.longjun.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciNumberTest {
    @Test
    public void testCalculate() {
        FibonacciNumber fib = new FibonacciNumber();

        assertThat(fib.calculate(1), is(1));
        assertThat(fib.calculate(2), is(1));
        assertThat(fib.calculate(3), is(2));
        assertThat(fib.calculate(4), is(3));
        assertThat(fib.calculate(5), is(5));
        assertThat(fib.calculate(6), is(8));
        assertThat(fib.calculate(7), is(13));
    }

}