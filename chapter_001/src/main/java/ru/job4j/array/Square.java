package ru.job4j.array;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        int y = 1; // Введем дополнительную переменную для создания содержимого массива от 1
        for (int i = 0; i < bound; i++) {
            rst[i] = y * y;
            y++;
        }
        return rst;
    }
}
