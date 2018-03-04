package ru.job4j.loop;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    /**
     * Расчитывает факториал числа n (1 * 2 * 3 * 4 * ... * n)
     * @param n вводим значение для расчета факториала
     * @return возвращет факториал
     */
    public int calc(int n) {
        int factorial = 1; // указываем значение, в случе если заданный параметр равен 0.
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
