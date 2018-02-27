package ru.job4j.max;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Возвращает наибольшее значение.
     *@return Возвращает максимальное значение
     */
    public int max(int first, int second){
        return first > second ? first : second;
    }
}