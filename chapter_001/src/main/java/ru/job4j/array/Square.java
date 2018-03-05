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
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }
}
