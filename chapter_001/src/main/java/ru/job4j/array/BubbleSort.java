package ru.job4j.array;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

// Реализуем пузырьковую сортировку
public class BubbleSort {
    public int[] sort(int[] array) {
        // Пузырьковая сортировка проверяет два значения на максимальное, двигаясь к концу массива.
        for (int y = array.length - 1; y > 0; y--) {
            for (int i = 0; i < y; i++) {
                if (array[i] > array[i + 1]) {
                    int turn = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = turn;
                }
            }
        }
        return array;
    }
}