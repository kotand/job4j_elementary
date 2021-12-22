package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(420);
        float expectedEuro = 6;
        boolean passedEuro = expectedEuro == euro;
        float dollar = Converter.rubleToDollar(420);
        float expectedDollar = 8;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("420 rubles are 6. Test result: " + passedEuro);
        System.out.println("420 rubles are 7. Test result: " + passedDollar);
    }
}

