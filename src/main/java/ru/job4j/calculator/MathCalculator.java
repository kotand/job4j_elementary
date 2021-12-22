package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return sub(first, second) + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sub(first, second) + division(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат вычитания и деления равен: " + subAndDivision(10, 20));
        System.out.println("Результат сложения всего равен: " + sumAll(10, 20));
    }
}
