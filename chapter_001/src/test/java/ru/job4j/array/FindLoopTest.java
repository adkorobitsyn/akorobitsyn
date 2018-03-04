package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class FindLoopTest {
    @Test
    public void notFindFour() {
        FindLoop findLoop = new FindLoop();
        int[] data = new int[5];
        for (int c = 0; c < 5; c++) {
            data[c] = c;
        }
        int result = findLoop.indexOf(data, 5);
        assertThat(result, is(-1));
    }
    @Test
    public void findFour() {
        FindLoop findLoop = new FindLoop();
        int[] data = new int[5];
        for (int c = 0; c < 5; c++) {
            data[c] = c;
        }
        int result = findLoop.indexOf(data, 4);
        assertThat(result, is(4));
    }
}