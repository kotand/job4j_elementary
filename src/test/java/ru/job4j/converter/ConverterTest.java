package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert420RblThen6Euro() {
        float euro = Converter.rubleToEuro(420);
        float expectedEuro = 6;
        boolean passedEuro = expectedEuro == euro;
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, euro, eps);
    }

    @Test
    public void whenConvert420RblThen7Dollar() {
        float dollar = Converter.rubleToDollar(420);
        float expectedDollar = 7;
        boolean passedDollar = expectedDollar == dollar;
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, dollar, eps);
    }
}