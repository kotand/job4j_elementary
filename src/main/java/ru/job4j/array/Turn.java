package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i]; // 0
            array[i] = array[array.length - i - 1]; // 4
            array[array.length - i - 1] = temp; // 0
        }
        return array;
    }
}