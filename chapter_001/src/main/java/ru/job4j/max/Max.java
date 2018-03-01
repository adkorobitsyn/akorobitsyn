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
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Возвращает наибольшее значение из 3 значений.
     * @return Возвращает максимальное значение из 3 значений.
     */
    public int max(int first, int second, int third) {
        int temp1 = this.max(first, second);
        int temp2 = this.max(second, third);
        return this.max(temp1, temp2);
    }
}