package ru.job4j.array;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class Turn {
    // Метод возвращает массив в обратном порядке.
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int back = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = back;
        }
        return array;
    }
}
