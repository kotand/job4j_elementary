package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForSixThenSevenPointTwenty() {
        int result = Factorial.calc(6);
        int expected = 720;
        Assert.assertEquals(expected, result);
    }
}