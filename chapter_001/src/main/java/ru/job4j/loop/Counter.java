package ru.job4j.loop;
/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    public int add(int start, int finish) {
        int n = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                n = n + i;
            }
        }
        return n;
    }
}
