package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double third = first + second;
        double rsl = Math.sqrt(third);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 4, 0);
        System.out.println("result (0, 0) to (4, 0) " + result);
    }
}
