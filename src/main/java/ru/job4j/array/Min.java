package ru.job4j.array;

public class Min {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 1; start + 1 < array.length; i++) {
            if (min > array[i]) {
               min = array[i];
           }
        }
        return min;
    }
}