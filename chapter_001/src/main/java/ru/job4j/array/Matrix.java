package ru.job4j.array;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {
    /**
     * Реализауем метод, создающий таблицу умножения
     * @param size принимает значение для создания матрицы
     */
    int[][] multiple(int size) {
        int[][] multiple = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                multiple[i][y] = i * y;
            }
        }
        return multiple;
    }
}
