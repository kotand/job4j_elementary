package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (checkPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}