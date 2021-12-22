package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1) + (y2 - y1), 2);
        double rsl = Math.sqrt(first);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 4, 4, 10);
        System.out.println("result (2, 4) to (4, 10) " + result);
    }
}
